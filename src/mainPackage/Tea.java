package mainPackage;

public class Tea extends Food {
    @Override // явное переопределение метода
    public boolean equals(Object obj) {
        if (!(obj instanceof Tea)){
            return false;
        }
        if (fill == null || ((Tea)obj).fill == null){
            return false;
        }
        if(!(fill.equals(((Tea) obj).fill))){
            return false;
        }

        return super.equals(obj);
    }

    private String fill;

    public String getFilling(){
        return fill;
    }

    public void setFilling(String fill){
        this.fill = fill;
    }

    public Tea(String fill){
        super ("Чай");
        this.fill = fill;
    }

    public void consume(){
        System.out.println(this + " выпит");
    }

    @Override
    public String toString() {
        return super.toString() + " '" + fill.toUpperCase() + "'";
    }

}

