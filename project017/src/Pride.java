public class Pride extends Car{
    private int width;
    private int height;

    public Pride(){
        this(0,0);
    }
    public Pride(int width, int height){
        super();
        this.height=height;
        this.width=width;
    }
    public Pride(int width,int height, int engine_volume, int gearbox, String color){
        super(engine_volume,gearbox,color);
        this.width=width;
        this.height=height;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public String gettype(){
        return "pride";
    }
    @Override
    public String getSize(){
        return "width = "+ this.getWidth()+ " mm"+" , height  = " + this.getHeight()+" mm";
    }
}
