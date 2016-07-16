package graduados.presentacion.ctrl;

import graduados.logica.servicios.SrvcPerspectivaLaboral;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author Geovanny
 */
@ManagedBean
@ViewScoped
public class CtrlSeccionDosPregunta11 {

    private CartesianChartModel pregunta;
    private PieChartModel pieModel;

    @PostConstruct
    public void graficar() {
        pregunta = grafica();
        createPieModel2();
    }

    private CartesianChartModel grafica() {
        CartesianChartModel model = new CartesianChartModel();
        try {

            ChartSeries test = new ChartSeries();
            test.setLabel("Trabaja para:");
            for (int i = 0; i < SrvcPerspectivaLaboral.obtenerSeccionDosPregunta11().size(); i++) {
                test.set(String.valueOf(SrvcPerspectivaLaboral.obtenerSeccionDosPregunta11().get(i).getS2p11()),
                        SrvcPerspectivaLaboral.obtenerSeccionDosDadoPregunta11(SrvcPerspectivaLaboral.obtenerSeccionDosPregunta11().get(i).getS2p11()).size());
            }

            model.addSeries(test);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return model;
    }

    private void createPieModel2() {
        pieModel = new PieChartModel();
        try {
            for (int i = 0; i < SrvcPerspectivaLaboral.obtenerSeccionDosPregunta11().size(); i++) {
                pieModel.set(String.valueOf(SrvcPerspectivaLaboral.obtenerSeccionDosPregunta11().get(i).getS2p11()),
                        SrvcPerspectivaLaboral.obtenerSeccionDosDadoPregunta11(SrvcPerspectivaLaboral.obtenerSeccionDosPregunta11().get(i).getS2p11()).size());
            }
        } catch (Exception e) {
        }

    }

    /*
     *** getters y setters
     */
    public CartesianChartModel getPregunta() {
        return pregunta;
    }

    public void setPregunta(CartesianChartModel pregunta) {
        this.pregunta = pregunta;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

}
