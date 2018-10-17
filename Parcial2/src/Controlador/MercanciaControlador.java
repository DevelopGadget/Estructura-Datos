package Controlador;

import Modelo.Mercancia;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.UUID;

public class MercanciaControlador {

    private Stack<Mercancia> MercanciaContainer = new Stack();
    private Stack<Mercancia> Mercancias = new Stack();
    private Queue<Mercancia> MercanciaInspeccion = new LinkedList();
    private Queue<Mercancia> MercanciaRevision = new LinkedList();
    private Queue<Mercancia> MercanciaImpor = new LinkedList();

    public MercanciaControlador() {
        Quemados("Persistencia.dat");
        MercanciaInspeccion = (Queue<Mercancia>) Leer("PilaInspec.dat");
        if (MercanciaInspeccion == null) {
            MercanciaInspeccion = new LinkedList();
        }
        Mercancias = (Stack<Mercancia>) Leer("Mercancias.dat");
        if (Mercancias == null) {
            Mercancias = new Stack();
        }
        MercanciaRevision = (Queue<Mercancia>) Leer("PilaReve.dat");
        if (MercanciaRevision == null) {
            MercanciaRevision = new LinkedList();
        }
        MercanciaImpor = (Queue<Mercancia>) Leer("PilaImpor.dat");
        if (MercanciaImpor == null) {
            MercanciaImpor = new LinkedList();
        }

    }

    public ArrayList<String[]> ReadMercancia() {
        ArrayList<String[]> Get = new ArrayList();
        MercanciaContainer.forEach(Item -> {
            if (Item.getEstado().equals("ALMACENADA")) {
                Get.add(new String[]{Item.getCodigo(), Item.getNombre(), Item.getPeso() + "", Item.getAltura() + "", Item.getColor()});
            }
        });
        return Get;
    }

    public ArrayList<String[]> ReadMercanciaImport() {
        ArrayList<String[]> Get = new ArrayList();
        Mercancias.forEach(Item -> {
            if (Item.getEstado().equals("IMPORTADA")) {
                Get.add(new String[]{Item.getCodigo(), Item.getNombre(), Item.getFechaSalida(), Item.getFechaInspeccion(), Item.getFechaRevision(), Item.getFechaImportacion()});
            }
        });
        return Get;
    }

    public void Sacar() {
        Mercancia M = MercanciaContainer.pop();
        M.setEstado("EN PROCESO");
        M.setFechaSalida(new Date().toString());
        MercanciaInspeccion.offer(M);
        Persistencia("Persistencia.dat", MercanciaContainer);
        Persistencia("PilaInspec.dat", MercanciaInspeccion);
    }

    public void Inspeccionar() {
        Mercancia M = MercanciaInspeccion.poll();
        M.setEstado("REVISADO FISICAMENTE");
        M.setFechaInspeccion(new Date().toString());
        MercanciaRevision.offer(M);
        Persistencia("PilaReve.dat", MercanciaRevision);
        Persistencia("PilaInspec.dat", MercanciaInspeccion);
    }

    public void Revisar() {
        Mercancia M = MercanciaRevision.poll();
        M.setEstado("LICENCIA REVISADA");
        M.setFechaRevision(new Date().toString());
        MercanciaImpor.offer(M);
        Persistencia("PilaReve.dat", MercanciaRevision);
        Persistencia("PilaImpor.dat", MercanciaImpor);
    }

    public void Importar() {
        Mercancia M = MercanciaImpor.poll();
        M.setEstado("IMPORTADA");
        M.setFechaImportacion(new Date().toString());
        Mercancias.push(M);
        Persistencia("Mercancias.dat", Mercancias);
        Persistencia("PilaImpor.dat", MercanciaImpor);
    }

    public ArrayList<String[]> ReadMercanciaCola(Queue<Mercancia> Cola, String Estado) {
        ArrayList<String[]> Get = new ArrayList();
        if (Cola.size() > 0) {
            Cola.forEach(Item -> {
                if (Item.getEstado().equals(Estado) && !Cola.element().getCodigo().equals(Item.getCodigo())) {
                    Get.add(new String[]{Item.getNombre()});
                }
            });
        }
        return Get;
    }

    private boolean Persistencia(String Url, Object Array) {
        try {
            FileOutputStream persisten = new FileOutputStream(Url);
            ObjectOutputStream obj_persiten = new ObjectOutputStream(persisten);
            obj_persiten.writeObject(Array);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private Object Leer(String Url) {
        File fichero = new File(Url);
        if (fichero.exists()) {
            try {
                FileInputStream archivo = new FileInputStream(Url);
                ObjectInputStream obj_archivo = new ObjectInputStream(archivo);
                return obj_archivo.readObject();
            } catch (IOException | ClassNotFoundException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    private void Quemados(String Url) {
        File fichero = new File(Url);
        if (!fichero.exists()) {
            MercanciaContainer.push(new Mercancia(UUID.randomUUID().toString(), "Mercancia 1", "ROJO", "ALMACENADA", "", "", "", "", 100, 150, 60));
            MercanciaContainer.push(new Mercancia(UUID.randomUUID().toString(), "Mercancia 2", "AZUL", "ALMACENADA", "", "", "", "", 120, 180, 70));
            MercanciaContainer.push(new Mercancia(UUID.randomUUID().toString(), "Mercancia 3", "VIOLETA", "ALMACENADA", "", "", "", "", 80, 130, 50));
            MercanciaContainer.push(new Mercancia(UUID.randomUUID().toString(), "Mercancia 4", "MORADO", "ALMACENADA", "", "", "", "", 70, 40, 90));
            MercanciaContainer.push(new Mercancia(UUID.randomUUID().toString(), "Mercancia 5", "AMARILLO", "ALMACENADA", "", "", "", "", 150, 90, 100));
            Persistencia(Url, MercanciaContainer);
        } else {
            MercanciaContainer = (Stack<Mercancia>) Leer("Persistencia.dat");
            if (MercanciaContainer == null) {
                MercanciaContainer = new Stack();
            }
        }
    }

    public Queue<Mercancia> getMercanciaInspeccion() {
        return MercanciaInspeccion;
    }

    public Queue<Mercancia> getMercanciaRevision() {
        return MercanciaRevision;
    }

    public Queue<Mercancia> getMercanciaImpor() {
        return MercanciaImpor;
    }

}
