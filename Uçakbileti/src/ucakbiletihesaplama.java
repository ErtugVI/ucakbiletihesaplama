import java.util.Scanner;

public class ucakbiletihesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner veri = new Scanner(System.in);
    int km,yas,cesit;
    System.out.println("Mesafeyi giriniz.");
    km = veri.nextInt();
    System.out.println("Ya��n�z� giriniz.");
    yas = veri.nextInt();
    System.out.println("Yolculuk �e�idini Se�iniz. (1=Tek Gidi�, 2=Gidi�/D�n��");
    cesit = veri.nextInt();
    
    double fiyat,yasindirimi,cesitindirimi;
    if(km > 0 && yas > 0 &&(cesit==1 || cesit==2)) {
    fiyat = km*10;
    if(yas<12) { yasindirimi=fiyat*0.5;}
    else if(yas >= 12 && yas <=24) {yasindirimi = fiyat *0.10;}
    else if(yas >= 65) {yasindirimi = fiyat *0.30;}
    else {yasindirimi = 9; }
    fiyat -= yasindirimi;
    if(cesit == 2) { cesitindirimi = fiyat *0.20;
    fiyat = (fiyat - cesitindirimi) * 2;
    }
    System.out.println("Bilet Tutar�:" + fiyat + "5");
    }else { System.out.println("Girdi�iniz De�er eksik veya yanl��. L�tfen tekrar ediniz.");
    }
    
    }
	}


