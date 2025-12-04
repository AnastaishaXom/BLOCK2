public class Lesson2_5 {
    static class MyArraySizeException extends Exception {
       public MyArraySizeException(String message) {
           System.out.println(message);
       }
    }

    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message){
            System.out.println(message);
        }
    }

    static class ArrayIndexOutOfBoundsException extends Exception {
        public ArrayIndexOutOfBoundsException(String message){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        try {
            String[][] massiv1={
                {"2","5","4","8"},
                {"1","H","1","3"},
                {"2","5","6","2"},
                {"1","1","1","1"}};                //массив 4*4, но с буквой
            String[][] massiv2 = {
                {"2","5","4","8"},
                {"1","2","1","3"},
                {"2","5","6","2"}};                //масссив 3*4
            String[][] massiv3={
                {"2","5","4","8"},
                {"1","2","1","3"},
                {"2","5","6","2"},
                {"1","1","1","1"}};                //массив 4*4 с цифрами

            //elementArray(massiv3);               //проверка ArrayIndexOutOfBoundsException

            //checkArraySize(massiv1);             //проверка MyArrayDataException
            
            //checkArraySize(massiv2);             // проверка MyArraySizeException
         
            checkArraySize(massiv3);               //корректный массив для MyArrayDataException и MyArraySizeException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка ArrayIndexOutOfBoundsException:выход за границу массива");
        }
        catch (MyArrayDataException e){
            System.out.println("Ошибка MyArrayDataException");
        }
        catch (MyArraySizeException e) {
            System.out.println("Ошибка MyArraySizeException: размер массива не соответствует 4*4");
        }
    }

    public static void checkArraySize(String[][] massiv) throws MyArraySizeException, MyArrayDataException{
        int summ = 0;
        int i=0;
        int j=0;
        boolean numb;

        if (massiv.length != 4) {
            throw new MyArraySizeException("Количество строк не равно 4. Текущий размер: " + massiv.length);
        }
        
        if (massiv[0].length != 4) {
                throw new MyArraySizeException("Количество столбцов не равно 4. Текущий размер: " + massiv[0].length);
        }

        for(i=0;i<4;i++){
           for(j=0;j<4;j++){
            numb=massiv[i][j].matches("\\d+");

                if(numb==false){
                    throw new MyArrayDataException("Не удалось преобразовать элемент массива massive["+i+"]"+"["+j+"]");
                }else{
                    summ=summ+Integer.parseInt(massiv[i][j]);
                }
            }}
            System.out.println("Сумма элементов массива равна: "+summ);
   }

    public static void elementArray(String[][] massiv) throws ArrayIndexOutOfBoundsException{           //метод для массивов размером 5*5 для проверки на выход за границу массива
            
        for(int i=0;i<5;i++){
            if(massiv.length<5 || massiv[0].length<5){
                throw new ArrayIndexOutOfBoundsException("Количество строк и столбцов меньше 5: "+massiv.length+"*"+massiv[0].length);
            }
           for(int j=0;j<5;j++){
               massiv[i][j]="1";     
           }}
    }
}
   
