package auginame;

public class Auginam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Visi augalai turi ðaknis");
		
		Sukulentai sukulentaiObject = new Sukulentai();
		sukulentaiObject.koksAs();
		Kambariniai kambariniaiObject = new Kambariniai();
		kambariniaiObject.koksAs();
		Egzotiniu egzotiniuObject = new Egzotiniu();
		egzotiniuObject.koksAs(); 
		AugalaiDemo kambaryje = new AugalaiDemo(Augalai.kambariniai);
		kambaryje.apibudink();
		AugalaiDemo egzotika = new AugalaiDemo(Augalai.egzotiniai);
		egzotika.apibudink();
		AugalaiDemo sukulentai = new AugalaiDemo(Augalai.sukulentai);
		sukulentai.apibudink();
		AugalaiDemo lapai = new AugalaiDemo (Augalai.lapiniai);
		lapai.apibudink();
	}

}
