package kata4v3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    
    private final Histogram<String> histogram;

    public HistogramDisplay(Histogram<String> histogram) {
        super("Histogram");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();  
    }
   
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 500));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart(null, null, null, dataSet, PlotOrientation.VERTICAL, false, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (Object key : histogram.keySet()) {
         dataSet.addValue(histogram.get(key), "", (Comparable) key);      
        }
        return dataSet;
    }

    void execute() {
        setVisible(true);
    }
    
}