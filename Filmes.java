import java.util.ArrayList;

public class ArrayListFilmes {
    static ArrayList aList = new ArrayList();
    public static void main(String[] args) {
        adicionaFilme();
        imprimeFilme();
    }
    static void adicionaFilme(){

        String NomeFilme; 
        String AnoLancamento; 
        String DiretorNome; 
        Date DiretorNasc = new Date(); 

        aList.add(NomeFilme);
        aList.add(AnoLancamento);
        aList.add(DiretorNome);
        aList.add(DiretorNasc);
    }
    static void imprimeFilme() {
        for(int i = 0; i<aList.size(); i++){
            System.out.println(aList.get(i));
        }
    }
}