public class personsort {
   public person[] performsort(person[] collection){
      int n = collection.length;
      for(int i = 0; i < n-1; i++){
         for(int j = 0; j < n-i-1; j++){
            if(!(collection[j].getAge()==collection[j+1].getAge())){
               if(collection[j].getAge()<collection[j+1].getAge()){
                  person temp = collection[j];
                  collection[j] = collection[j+1];
                  collection[j+1] = temp;
               }
            }
            if(collection[j].getAge()==collection[j+1].getAge()){
               if(collection[j].getFirstname().compareTo(collection[j+1].getFirstname())>0){
                  person temp = collection[j];
                  collection[j] = collection[j+1];
                  collection[j+1] = temp;
               }
               if(collection[j].getFirstname().compareTo(collection[j+1].getFirstname())==0){
                  if(collection[j].getLastname().compareTo(collection[j+1].getLastname())>0){
                     person temp = collection[j];
                     collection[j] = collection[j+1];
                     collection[j+1] = temp;
                  }
               }
            }
         }
      }
      return collection;
   } 
}
