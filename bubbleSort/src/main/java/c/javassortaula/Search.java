/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c.javassortaula;

/**
 *
 * @author carlo
 */
public class Search {
    private long contacomparacoes;

    public long getContacomparacoes() {
        return contacomparacoes;
    }
    public int linearSearch(Integer[] v, Integer x){
        this.contacomparacoes = 0;
        for(int i = 0; i <v.length; i++){
            this.contacomparacoes++;
            if(x==v[i])
                return i;
            
        }
        return -1;
    }
    
    public int binarySearch(Integer[] v, Integer x){
        int inicio = 0;
        int fim = v.length-1;
        this.contacomparacoes=0;
        while(inicio<=fim){
            int meio = (inicio+fim)/2;
            this.contacomparacoes++;
            if(x == v[meio])
                return meio;
            else
                if(x<v[meio])
                    fim = meio-1;
            else
                    inicio = meio+1;
        }
        return -1;
    }
}
    

