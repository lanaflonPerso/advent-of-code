package traitement2017;

import org.junit.Test;

import traitement2017.Traitement01;

import static org.junit.Assert.*;

public class Exercice01Test{

	private String chaine = "938427449468363235935164141137457346627316468733753676977948743374917918556846129623335"
			+ "36119926727537781269352767698854247195532916161361722988831566262541512788525823979496978744"
			+ "621785362953418221373775633228155275922677912131154186353631748761321962343748876263249313712"
			+ "4184124287378349383591923842187911642148154382622227815223857676213257776321464256954529866893"
			+ "521691149346222962978697827354814717138432152595295919637772849363287261829118325688841777949512"
			+ "4837828187298244786175872713299271766246696631257484453347125176233373232245382158656142179687576"
			+ "3889511759534192868586732211385539122295765231231148716374879787758557774839218965683332823331371"
			+ "7573974623426274425625414923384351725461398147635514748797585968593652716173764492911934512727314976"
			+ "2325158784595946931447738173246311763677997888425452294562823751136515271874725143582623717324394587"
			+ "39837129852336838659542671414871773534523765724971268589592143346894918223514669817439392828831398535"
			+ "57697994855117494235529359923916244245752783336254761488883557169676284548628344633578342917884796775"
			+ "765616811715161284957379231555334384131566391551288313498946463175465368863193285735126223257896721151"
			+ "716181955485349411849392339141664323493219928792873499328191359195189555614566159891372218754835615994"
			+ "9334298159567896183656243543628567376421394175895448958265627112142955545536854528941698162496126196395"
			+ "3364918377483776322142975937971552271642224933926326665557787586927667898255947116988278131974381388514"
			+ "2748338525526956797134248365363484492731494158725221115227494481889931598141834118539945791478673858676"
			+ "19467777654943169814287928966652552129439822741856512265955664872454951159255617513136142717471774698224"
			+ "5665436175957427532441423644385897293569394833874663634772242834778438896792212293449744416244484898537"
			+ "64111425798141258155246636844914711222931548722647298953744242682551562166463942694715631497895981643174"
			+ "19429482686856157858685132626261973127266539771138145974528121819651515591787769466318673259968891287814"
			+ "924268874158482283186174884581787168162169794447237768865836814569861486145651813837698968816692118722472"
			+ "6942589996534179549171859786241718727295379";

	@Test
	public void traitementTest(){
		Traitement01 exercice1 = new Traitement01();

		assertEquals(3,exercice1.traitement("1122",1));
		assertEquals(4,exercice1.traitement("1111",1));
		assertEquals(0,exercice1.traitement("1234",1));
		assertEquals(9,exercice1.traitement("91212129",1));
		assertEquals(1089,exercice1.traitement(chaine,1));

		assertEquals(6,exercice1.traitement("1212",2));
		assertEquals(0,exercice1.traitement("1221",2));
		assertEquals(4,exercice1.traitement("123425",3));
		assertEquals(12,exercice1.traitement("123123",3));
		assertEquals(4,exercice1.traitement("12131415",4));
		assertEquals(1156,exercice1.traitement(chaine,chaine.length()/2));

		assertEquals(2134,chaine.length());	
	}
}