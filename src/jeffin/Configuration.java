package jeffin;

public class Configuration {

    private GraphicQuality graphicQuality;
    private int fpsLimit;

    public GraphicQuality getGraphicQuality() {
        return graphicQuality;
    }

    public void setGraphicQuality(GraphicQuality graphicQuality) {
        this.graphicQuality = graphicQuality;
    }

    public int getFpsLimit() {
        return fpsLimit;
    }

    public void setFpsLimit(int fpsLimit) {
        this.fpsLimit = fpsLimit;
    }
}
