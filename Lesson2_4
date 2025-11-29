public class Lesson2_4 {
    public static void main(String[] args) {
        Animal animal=new Animal();
        
        
        Animal.Dogs dogRich=new Animal.Dogs("Рич");
        Animal.Cats catVacia=new Animal.Cats("Вася");
        dogRich.animalRun(250);
        dogRich.animalRun(600);
        dogRich.animalSwim(5);
        dogRich.animalSwim(20);
        System.out.println("");
        catVacia.animalRun(250);
        catVacia.animalRun(200);
        catVacia.animalSwim(20);
        

        System.out.println("");

        Animal.Cats[] catsArray=new Animal.Cats[3];
        catsArray[0]=new Animal.Cats("Муся");
        catsArray[1]=new Animal.Cats("Матроскин");
        catsArray[2]=new Animal.Cats("Aлиса");

        Animal.Cats.putMiska(50);

        Animal.Cats.eatCats("Муся",10);
        Animal.Cats.eatCats("Матроскин",5);
        Animal.Cats.eatCats("Алиса",45);

        System.out.println("");

        Animal.countAnimals();
        Animal.Dogs.countDogs();
        Animal.Cats.countCats();

    }
}
    class Animal{
        String name;
        int distance;
        static int count;
        

        public void animalRun(int distance){
            System.out.println(name+"пробежал "+distance+" м");
        }

        public void animalSwim(int distance){
            System.out.println(name+"проплыл"+distance+" м");
        }

        public static void countAnimals(){
            count=Dogs.countDogs+Cats.countCats;
            System.out.println("Создано "+count+" животных");
        }

        public static class Dogs extends Animal{
            static int countDogs=0;

            public Dogs(String name){
                this.name=name;
                countDogs++;
            }

            public static void countDogs(){
            System.out.println("Создано "+countDogs+" собак");
        }

            @Override
            public void animalRun(int distance){
                if(distance<=500){
                    System.out.println(name+" пробежал "+distance+" м");
                }
                else{
                    System.out.println(name+" не может бегать так много");
                }
            }    
            
            @Override
            public void animalSwim(int distance){
                if(distance<=10){
                    System.out.println(name+" проплыл "+distance+" м");
                }
                else{
                    System.out.println(name+" не может плавать так много");
                }
            }
        }

        public static class Cats extends Animal{
            static int countCats=0;
            static boolean full=false;
            static int miska;
            

            public Cats(String name){
                this.name=name;
                countCats++;
            }

            public static void countCats(){
            System.out.println("Создано "+countCats+" кошек");
            }

            @Override
            public void animalRun(int distance){
                if(distance<=200){
                    System.out.println(name+" пробежал "+distance+" м");
                }
                else{
                    System.out.println(name+" не может бегать так много");
                }

            }

            @Override
            public void animalSwim(int distance){
                System.out.println("Коты не умеют плавать");
            }    

            public static void eatCats (String name,int food){
                full=false;
                if(food>miska){
                    System.out.println("В миске недостаточно еды");
                    
                }else if(food>=10){
                    full=true;
                    miska=miska-food;
                    
                }
                if(full==true){
                    System.out.println("Кот "+name+" сыт");
                }else{
                    System.out.println("Кот "+name+" остался голодным");
                }
            }

            public static void putMiska(int putfood){
                miska=miska+putfood;
                System.out.println("Количество еды в миске: "+miska);
            }

        }

    }


