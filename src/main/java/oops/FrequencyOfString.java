package oops;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class FrequencyOfString {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       // findFrequency("hyderabad");
        //validateEmploye();
     // CompletableFuture<Void> data=  validateEmp();
      //data.get();
     // CompletableFuture<List<Employe>> list= validateEmployess();
    /* List<Employe> lsemp= list.join();
     lsemp.stream().forEach(System.out::println);*/

  //  CompletableFuture<Void> cp= CompletableFuture.allOf(data,list);
   // cp.join();
        String word=" hyderabad is biggest city in the india";
        findLengthForWord(word);

    }

    public static void findFrequency(String str){

        char ch[]=str.toCharArray();
        int counter=0;
        Map<Character,Integer> map=new HashMap<>();
        for(char c: ch){

            counter= map.getOrDefault(c,0);
            map.put(c,counter+1);


        }

        for(Map.Entry<Character,Integer> local: map.entrySet()){
            System.out.println(local.getKey()+" "+local.getValue());
        }
    }

    private int validator(Map<Character,Integer> ds, char key){
        ds.values();
        int value=ds.get(key);
        if(value!=0)
                for(Map.Entry<Character,Integer> local: ds.entrySet()){
                    local.getKey();
                }
        return 0;
    }

    public static void validateEmploye(){
        List<Employe> employes= Arrays.asList(new Employe(1,"john",200.0,"hyd",7268172),
                new Employe(2,"merry",250.0,"chennai",2438172),
        new Employe(3,"jin",300.0,"kolkata",37488172));
        CompletableFuture<Void> emp= CompletableFuture.runAsync(()-> {

            List<Employe> ls = employes.stream().filter(e -> e.getName().startsWith("j")).collect(Collectors.toList());

            for(Employe employe: ls){
                System.out.println(employe);
            }

        });
        emp.join();
    }

    public static CompletableFuture<Void> validateEmp(){
        List<Employe> employes= Arrays.asList(new Employe(1,"john",200.0,"hyd",7268172),
                new Employe(2,"merry",250.0,"chennai",2438172),
                new Employe(3,"jin",300.0,"kolkata",37488172));
        CompletableFuture<Void> emp= CompletableFuture.runAsync(()-> {

            List<Employe> ls = employes.stream().filter(e -> e.getName().startsWith("j")).collect(Collectors.toList());

            for(Employe employe: ls){
                System.out.println(employe);
            }

        });
        return  emp;
    }
    public static CompletableFuture<List<Employe>> validateEmployess(){
        List<Employe> employes= Arrays.asList(new Employe(1,"john",200.0,"hyd",7268172),
                new Employe(2,"merry",250.0,"chennai",2438172),
                new Employe(3,"jin",300.0,"kolkata",37488172),
                new Employe(3,"zin",300.0,"kolkata",37488172),
                new Employe(3,"zune",300.0,"kolkata",37488172));
        CompletableFuture<List<Employe>> emp= CompletableFuture.supplyAsync(()-> {

            List<Employe> ls = employes.stream().filter(e -> e.getName().startsWith("z")).collect(Collectors.toList());

           /* for(Employe employe: ls){
                System.out.println(employe);*/
           // }
            return ls;

        });
        return emp;

    }

    public static void findLengthForWord(String str){

     String s=  Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
      System.out.println(s);
    }

    public void dummy(){
        System.out.println("testing");
        System.out.println("testing1");
    }
}
