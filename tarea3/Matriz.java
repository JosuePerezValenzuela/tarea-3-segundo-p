
public class Matriz
{
   private int x;
   private int y;
   private int [][] numeros;
   public Matriz(int x, int y){
      this.x =x;
      this.y =y;
   }
   public int[][] MatrizCaracol (){   
     int filas = x;
     int columnas = y;
     int [][] numeros = new int [filas][columnas]; 
     int aux = 1;
     int inicio = 0;
     int limite = x - 1;
     while(aux <= x * x){
        for(int j = inicio;j <= limite; j = j + 1){
          numeros[inicio][j] = aux;
          aux = aux + 1;
        }
        for(int i = inicio + 1;i <= limite; i = i +1){
          numeros[i][limite]= aux;
          aux = aux + 1;
        }
        for(int j = limite - 1; j >= inicio; j = j - 1){
          numeros[limite][j] = aux;
          aux = aux + 1;
        }
        for(int i = limite - 1; i >= inicio + 1; i = i - 1){
          numeros[i][inicio]= aux;
          aux = aux + 1;
        }
        inicio = inicio + 1;
        limite = limite - 1;
     }
     return numeros;
     }
   public int [][] recoEnX (){
     int filas = x;
     int columnas = y;
     int [][] numeros = new int [filas][columnas];
     int pintado = 1;
     boolean bandera = true;
     int h = 0;
     for(int i = 0; i < numeros.length; i++){
        for(int j = 0; j < numeros[0].length; j++){
         if(i == j){
            numeros [i][j]= pintado;
        }else{
             numeros[i][j]= 0;
            }   
        }
    }
    for(int i = numeros.length - 1; i>=0; i--){
      numeros [i][h] = pintado;
      h++;
    }
    return numeros;
    }
    public void imprimir (int a [][]){
      for(int i = 0;i < a.length;i = i + 1){
        for(int j = 0; j < a[0].length; j = j + 1){
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
        }
   }
}

