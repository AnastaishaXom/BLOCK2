

import java.util.ArrayList;

public class Lesson2_6 {
    public static void main(String[] args){

        ArrayList<Student>students=new ArrayList<>();
        ArrayList<NumBook> numBook=new ArrayList<>();

        students.add(new Student("Петров",21,2,3));
        students.add(new Student("Васичкин",22,1,2));
        students.add(new Student("Сидоров",23,1,4));
        students.add(new Student("Петрова",22,3,3));
        
        
        Student.printKursStudents(students,1);
        System.out.println("");

        Student.nextKursStudent(students);
        System.out.println("");
        
        Student.deleteStudent(students);
        System.out.println("");
        
        numBook.add(new NumBook("Иванов","+7 (903) 123-45-67"));
        numBook.add(new NumBook("Смирнов","+7 (916) 987-65-43"));
        numBook.add(new NumBook("Кузнецов","+7 (925) 456-78-90"));
        numBook.add(new NumBook("Попов","+7 (905) 321-09-87"));
        numBook.add(new NumBook("Васильев","+7 (985) 654-32-10"));
        numBook.add(new NumBook("Попов","+7 (963) 789-01-23"));

        NumBook.getNumb(numBook,"Попов");

    }

    public static class Student{
        String name;
        int group;
        int kurs;
        int rating;

        public Student(String name,int group,int kurs,int rating){
            this.name=name;
            this.group=group;
            this.kurs=kurs;
            this.rating=rating;
        }

        public int getRating() {
        return rating;
        }

        public int getKurs() {
        return kurs;
        }

        public int setKurs(int kurs) {
            this.kurs=kurs;
            return kurs;
        }

        public static void deleteStudent(ArrayList student){
            int j=student.size();
            for(int i=0;i<j;i++){
                Student onestudent=(Lesson2_6.Student) student.get(i);
                  if(onestudent.getRating()<3){
                    student.remove(i);
                    i--;
                    j--;
                  }
                  else{
                  System.out.println("Фамилия: "+onestudent.name+", группа: "+onestudent.group+", курс: "+onestudent.kurs+", средний балл: "+onestudent.rating);
                  }
            }
           
        }

        public static void nextKursStudent(ArrayList student){
            for(int i=0;i<student.size();i++){
                Student onestudent=(Lesson2_6.Student) student.get(i);
                  if(onestudent.getRating()>=3){
                    onestudent.setKurs(onestudent.getKurs()+1);
                  }
                  System.out.println("Фамилия: "+onestudent.name+", группа: "+onestudent.group+", курс: "+onestudent.kurs+", средний балл: "+onestudent.rating);
            }
        }

        public static void printAllStudents(ArrayList student){
            
            for (int i = 0; i < student.size(); i++) {
            Student onestudent=(Lesson2_6.Student) student.get(i);
            System.out.println("Фамилия: "+onestudent.name+", группа: "+onestudent.group+", курс: "+onestudent.kurs+", средний балл: "+onestudent.rating);
            }
        }

        public static void printKursStudents(ArrayList student,int kurs){
            for (int i = 0; i < student.size(); i++) {
            Student onestudent=(Lesson2_6.Student) student.get(i);
               if(onestudent.kurs==kurs){
            System.out.println("Фамилия: "+onestudent.name+", группа: "+onestudent.group+", курс: "+onestudent.kurs+", средний балл: "+onestudent.rating);
               }
            }
        }

        }

        public static class NumBook{
            String name;
            String numb;

            public NumBook(String name,String numb){
                this.name=name;
                this.numb=numb;
            }

            public static void getNumb(ArrayList numbs,String name){
                for (int i = 0; i < numbs.size(); i++) {
                NumBook onenote=(Lesson2_6.NumBook) numbs.get(i);
                   if(onenote.name==name){
                   System.out.println("Фамилия: "+onenote.name+", телефон: "+onenote.numb);
                   }
                }
            }

        }

    }



