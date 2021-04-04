public class stringsort{
   private char[] sttoarray;
   public void performsort(String input){
      this.sttoarray = input.toCharArray();
      int n = this.sttoarray.length;
      for(int i = 0; i < n-1; i++){
         for(int j = 0; j < n-i-1; j++){
            if((int)this.sttoarray[j] > (int)this.sttoarray[j+1]){
               char temp = this.sttoarray[j];
               this.sttoarray[j] = this.sttoarray[j+1];
               this.sttoarray[j+1] = temp;
            }
         }
      }
   }
   public String get(){
      return new String(this.sttoarray);
   }
}
