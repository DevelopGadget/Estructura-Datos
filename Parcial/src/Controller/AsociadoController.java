package Controller;

import Model.Asociado;
import Model.Cuota;
import Model.Prestamo;
import java.util.Vector;

public class AsociadoController {

    private Vector<Asociado> Asociados = new Vector();
    private Vector<Prestamo> Prestamos = new Vector();
    private Vector<Vector<Cuota>> Cuotas = new Vector();

    public void Crear(Asociado P) {
        Asociados.add(P);
    }

    public void CrearPrestamo(Prestamo P) {
        Prestamos.add(P);
    }

    public void CrearCuotas(Prestamo P, int Index, Vector<Cuota> CuotasA, int Asociado) {
        double Cuota = P.getValor() / P.getPlazo();
        if (Index == 1) {
            CuotasA.add(new Cuota(Index, Cuota, P.getValor(), P.getValor() - Cuota, false, P));
        } else {
            double Saldo = CuotasA.get(Index - 2).getSaldo() - Cuota;
            if (Saldo < 0) {
                Saldo = 0;
            }
            CuotasA.add(new Cuota(Index, Cuota, CuotasA.get(Index - 2).getSaldo(), Saldo, false, P));
        }
        Index++;
        if (Index <= P.getPlazo()) {
            CrearCuotas(P, Index, CuotasA, Asociado);
        } else {
            Cuotas.add(CuotasA);
            Asociados.get(Asociado).setIndexCuotas(Cuotas.size() - 1);
        }
    }

    public Vector<String[]> ReadCuotas(String Codigo) {
        Vector<String[]> Find = new Vector();
        Cuotas.forEach(Item -> {
            Item.forEach(Item2 -> {
                if (Item2.getPrestamo().getPersona().getCodigo().equals(Codigo)) {
                    Find.add(new String[]{Item2.getnCuota() + "", Item2.getValorCuota() + "", Item2.getValorPagar() + "",
                        Item2.getSaldo() + "", Item2.isPagado() + ""});
                }
            });
        });
        return Find;
    }

    public void CambiarEstadoCuota(int Index, int nCuota) {
        Cuotas.get(Index).forEach(Item -> {
            if (Item.getnCuota() == nCuota) {
                Item.setPagado(true);
            }
        });
    }

    public boolean ValidarEstadoPrestamo(int Index) {
        int i = 0;
        for (int j = 0; j < Cuotas.get(Index).size(); j++) {
            if (Cuotas.get(Index).get(j).isPagado()) {
                i++;
            }
            if (i == Cuotas.get(Index).size()) {
                return true;
            }
        }
        return false;
    }

    public Vector<String[]> ReadAsociados() {
        Vector<String[]> Find = new Vector();
        Asociados.forEach(Item -> {
            Find.add(new String[]{Item.getCodigo(), Item.getNombre(), Item.getSalario() + "", Item.getEstado()});
        });
        return Find;
    }

    public Asociado Read(String Codigo) {
        for (int i = 0; i < Asociados.size(); i++) {
            if (Asociados.get(i).getCodigo().equals(Codigo)) {
                return Asociados.get(i);
            }
        }
        return null;
    }

    public void CambiarEstado(String Codigo, String Estado) {
        Asociados.forEach(Item -> {
            if (Item.getCodigo().equals(Codigo)) {
                Item.setEstado(Estado);
            }
        });
    }

    public Prestamo GetPrestamo() {
        return Prestamos.get(Prestamos.size() - 1);
    }

    public int IndexCuota(int Index) {
        return Asociados.get(Index).getIndexCuotas();
    }
}
