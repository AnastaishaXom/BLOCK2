public class Lesson2_3 {
        public static void main(String[] args) {

            System.out.println("Товары:");
            System.out.println();

            Product [] productsArray=new Product[5];
            productsArray[0] = new Product("Ноутбук Dell Inspiron 15", "2022-02-20", "LG", "Южная Корея", 50999, false);
            productsArray[1] = new Product("Пылесос Philips PowerPro", "2023-01-05", "Philips", "Нидерланды", 40000, true);
            productsArray[2] = new Product("Холодильник LG InstaView", "2022-02-20", "LG", "Южная Корея", 72400, true);
            productsArray[3] = new Product("Микроволновая печь Bosch", "2021-08-15", "Bosch", "Германия", 6230, false);
            productsArray[4] = new Product("Смартфон Samsung Galaxy S21", "2022-11-01", "Samsung", "Южная Корея", 23600, false);
            
            System.out.println("Аттракционы:");
            System.out.println();

            Park myPark=new Park();
            myPark.koleso.printInfo();
            myPark.hiphop.printInfo();
    }
}
    class Product{
        String name;
        String date;
        String producer;
        String country;
        int price;
        boolean reserv;

        public Product(String name,String date,String producer,String country,int price,boolean reserv){
            this.name=name;
            this.date=date;
            this.producer=producer;
            this.country=country;
            this.price=price;
            this.reserv=reserv;

            System.out.println("Название: "+name);
            System.out.println("Дата: "+date);
            System.out.println("Производитель: "+producer);
            System.out.println("Страна производитель: "+country);
            System.out.println("Цена: "+price);
            System.out.println("Состояние бронирования покупателем: "+reserv);
            System.out.println();

        }   
    }    

    class Park{

        Park.Attractions koleso=new Park.Attractions("Колесо",8,350);
        Park.Attractions hiphop=new Park.Attractions("Хип-Хоп",6,500);

        class Attractions{
        
            String name;
            int time;
            int price;

            public Attractions(String name,int time,int price){
                this.name=name;
                this.time=time;
                this.price=price;
            }

            public void printInfo(){
                System.out.println("Название: "+name);
                System.out.println("Время работы: "+time);
                System.out.println("Стоимость: "+price);
                System.out.println();
            }
                
        }

       
    }
