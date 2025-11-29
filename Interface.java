public interface Figures {
    public static void main(String[] args) {
        Figures krug=new Krug(4);
        krug.fullColor("Красный");
        krug.borderColor("Черный");
        
        System.out.println("Периметр равен: "+krug.perimetr());
        System.out.println("Площадь равна: "+krug.ploshad());
        System.out.println("");

        Figures priamoygolnic=new Priamoygolnic(5,7);
        krug.fullColor("Желтый");
        krug.borderColor("Синий");
        
        System.out.println("Периметр равен: "+priamoygolnic.perimetr());
        System.out.println("Площадь равна: "+priamoygolnic.ploshad());
        System.out.println("");

        Figures treygolnic=new Treygolnic(5,4,4,3);
        krug.fullColor("Оранжевый");
        krug.borderColor("Красный");
        
        System.out.println("Периметр равен: "+treygolnic.perimetr());
        System.out.println("Площадь равна: "+treygolnic.ploshad());
        System.out.println("");


    }

    
    default double perimetr(){
        return 0;
    };
    default double ploshad(){
        return 0;
    };

    void fullColor(String color);
    void borderColor(String color);
}

    class Krug implements Figures{
        double pi=3.14;
        double radius;
        private String fullColor;
        private String borderColor;

        public Krug(double radius){
            this.radius=radius;
        }

        @Override
        public double perimetr(){
        return 2*pi*radius;
        };

        @Override
        public double ploshad(){
        return pi*radius*radius;
        };

        @Override
        public void fullColor(String color){
            this.fullColor=color;
            System.out.println("Цвет заливки: "+color);
        }
        
        @Override
        public void borderColor(String color){
            this.borderColor=color;
            System.out.println("Цвет контура: "+color);
        }

    }

    class Priamoygolnic implements Figures{
        
        private String fullColor;
        private String borderColor;
        double width;
        double length;

        public Priamoygolnic(double width,double length){
            this.width=width;
            this.length=length;
        }

        @Override
        public double perimetr(){
        return 2*(width+length);
        };

        @Override
        public double ploshad(){
        return width*length;
        };

        @Override
        public void fullColor(String color){
            this.fullColor=color;
            System.out.println("Цвет заливки: "+color);
        }
        
        @Override
        public void borderColor(String color){
            this.borderColor=color;
            System.out.println("Цвет контура: "+color);
        }
    }

    class Treygolnic implements Figures{
        private String fullColor;
        private String borderColor;
        double a,b,c,h;

        public Treygolnic(double a,double b,double c,double h){
            this.a=a;
            this.b=b;
            this.c=c;
            this.h=h;
        }

        @Override
        public double perimetr(){
        return a+b+c;
        };

        @Override
        public double ploshad(){
        return (a*h)/2;
        };

        @Override
        public void fullColor(String color){
            this.fullColor=color;
            System.out.println("Цвет заливки: "+color);
        }
        
        @Override
        public void borderColor(String color){
            this.borderColor=color;
            System.out.println("Цвет контура: "+color);
        }

    }


