package Views;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LDCView extends JFrame implements ActionListener {	
	
	private static final long serialVersionUID = 1L;	
	
	private JButton jbtAhri = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ahri.png")));	    
	private JButton jbtAkali = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Akali.png")));
	private JButton jbtAlistar = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Alistar.png")));
	private JButton jbtAmumu = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Amumu.png")));
	private JButton jbtAnivia = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Anivia.png")));
	private JButton jbtAnnie = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Annie.png")));
	private JButton jbtAshe = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ashe.png")));
	private JButton jbtBlitzcrank = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Blitzcrank.png")));
	private JButton jbtBrand = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Brand.png")));
	private JButton jbtCaitlyn = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Caitlyn.png")));
	private JButton jbtCassiopeia = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Cassiopeia.png")));
	private JButton jbtChogath = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/ChoGath.png")));
	private JButton jbtCorki = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Corki.png")));
	private JButton jbtDarius = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Darius.png")));
	private JButton jbtDiana = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Diana.png")));
	private JButton jbtDrmundo = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/DrMundo.png")));
	private JButton jbtDraven = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Draven.png")));
	private JButton jbtElise = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Elise.png")));
	private JButton jbtEvelynn = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Evelynn.png")));
	private JButton jbtEzreal = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ezreal.png")));
	private JButton jbtFiddlesticks = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Fiddlesticks.png")));
	private JButton jbtFiora = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Fiora.png")));
	private JButton jbtFizz = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Fizz.png")));
	private JButton jbtGalio = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Galio.png")));
	private JButton jbtGangplank = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Gangplank.png")));
	private JButton jbtGaren = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Garen.png")));
	private JButton jbtGragas = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Gragas.png")));
	private JButton jbtGraves = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Graves.png")));
	private JButton jbtHecarim = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Hecarim.png")));
	private JButton jbtHeimerdinger = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Heimerdinger.png")));
	private JButton jbtIrelia = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Irelia.png")));
	private JButton jbtJanna = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Janna.png")));
	private JButton jbtJarvenIV = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/JarvenIV.png")));
	private JButton jbtJax = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Jax.png")));
	private JButton jbtJayce = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Jayce.png")));
	private JButton jbtKarma = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Karma.png")));
	private JButton jbtKarthus = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Karthus.png")));
	private JButton jbtKassadin = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Kassadin.png")));
	private JButton jbtKatarina = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Katarina.png")));
	private JButton jbtKayle = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Kayle.png")));
	private JButton jbtKennen = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Kennen.png")));
	private JButton jbtKhazix = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/KhaZix.png")));
	private JButton jbtKogmaw = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/KogMaw.png")));
	private JButton jbtLeblanc = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/LeBlanc.png")));
	private JButton jbtLeesin = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/LeeSin.png")));
	private JButton jbtLeona = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Leona.png")));
	private JButton jbtLulu = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Lulu.png")));
	private JButton jbtLux = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Lux.png")));
	private JButton jbtMalphite = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Malphite.png")));
	private JButton jbtMalzahar = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Malzahar.png")));
	private JButton jbtMaokai = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Maokai.png")));
	private JButton jbtMasteryi = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/MasterYi.png")));
	private JButton jbtMissfortune = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/MissFortune.png")));
	private JButton jbtMordekaiser = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Mordekaiser.png")));
	private JButton jbtMorgana = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Morgana.png")));
	private JButton jbtNami = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Nami.png")));
	private JButton jbtNasus = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Nasus.png")));
	private JButton jbtNautilus = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Nautilus.png")));
	private JButton jbtNidalee = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Nidalee.png")));
	private JButton jbtNocturne = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Nocturne.png")));
	private JButton jbtNunu = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Nunu.png")));
	private JButton jbtOlaf = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Olaf.png")));
	private JButton jbtOrianna = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Orianna.png")));
	private JButton jbtPantheon = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Pantheon.png")));
	private JButton jbtPoppy = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Poppy.png")));
	private JButton jbtRammus = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Rammus.png")));
	private JButton jbtRenekton = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Renekton.png")));
	private JButton jbtRengar = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Rengar.png")));
	private JButton jbtRiven = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Riven.png")));
	private JButton jbtRumble = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Rumble.png")));
	private JButton jbtRyze = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ryze.png")));
	private JButton jbtSejuani = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sejuani.png")));
	private JButton jbtShaco = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Shaco.png")));
	private JButton jbtShen = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Shen.png")));
	private JButton jbtShyvana = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Shyvana.png")));
	private JButton jbtSinged = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Singed.png")));
	private JButton jbtSion = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sion.png")));
	private JButton jbtSivir = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sivir.png")));
	private JButton jbtSkarner = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Skarner.png")));
	private JButton jbtSona = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sona.png")));
	private JButton jbtSoraka = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Soraka.png")));
	private JButton jbtSwain = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Swain.png")));
	private JButton jbtSyndra = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Syndra.png")));
	private JButton jbtTalon = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Talon.png")));
	private JButton jbtTaric = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Taric.png")));
	private JButton jbtTeemo = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Teemo.png")));
	private JButton jbtThresh = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Thresh.png")));
	private JButton jbtTristana = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Tristana.png")));
	private JButton jbtTrundle = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Trundle.png")));
	private JButton jbtTryndamere = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Tryndamere.png")));
	private JButton jbtTwistedfate = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/TwistedFate.png")));
	private JButton jbtTwitch = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Twitch.png")));
	private JButton jbtUdyr = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Udyr.png")));
	private JButton jbtUrgot = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Urgot.png")));
	private JButton jbtVarus = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Varus.png")));
	private JButton jbtVayne = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Vayne.png")));
	private JButton jbtVeigar = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Veigar.png")));
	private JButton jbtVi = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Vi.png")));
	private JButton jbtViktor = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Viktor.png")));
	private JButton jbtVladimir = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Vladimir.png")));
	private JButton jbtVolibear = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Volibear.png")));
	private JButton jbtWarwick = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Warwick.png")));
	private JButton jbtWukong = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Wukong.png")));
	private JButton jbtXerath = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Xerath.png")));
	private JButton jbtXinzhao = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/XinZhao.png")));
	private JButton jbtYorick = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Yorick.png")));
	private JButton jbtZed = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Zed.png")));
	private JButton jbtZiggs = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ziggs.png")));
	private JButton jbtZilean = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Zilean.png")));
	private JButton jbtZyra = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Zyra.png")));
			
	/**
	 * Creates the main window. 
	 */
	public LDCView() {
	
		setTitle("League of Legends Champion Simulator");
		
		GridLayout layout = new GridLayout(10,10);
		JPanel jplChampButtons = new JPanel(layout);
		addChamps(jplChampButtons);
		
		JPanel jplChampions = new JPanel(new BorderLayout());
		JLabel lblChampions = new JLabel("Champions", JLabel.CENTER);
		
		jplChampions.add(jplChampButtons, BorderLayout.CENTER);
		jplChampions.add(lblChampions, BorderLayout.NORTH);
		jplChampions.setMaximumSize(new Dimension(900,800));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());		
		add(jplChampions);		
		pack();
		setSize(900, 800);
		setVisible(true);
		
	}
	

	/**
	 * Adds all of the champions to the panel.
	 */
	public void addChamps(JPanel pnl){
		pnl.add(jbtAhri);
		pnl.add(jbtAkali);
		pnl.add(jbtAlistar);
		pnl.add(jbtAmumu);
		pnl.add(jbtAnivia);
		pnl.add(jbtAnnie);
		pnl.add(jbtAshe);
		pnl.add(jbtBlitzcrank);
		pnl.add(jbtBrand);
		pnl.add(jbtCaitlyn);
		pnl.add(jbtCassiopeia);
		pnl.add(jbtChogath);
		pnl.add(jbtCorki);
		pnl.add(jbtDarius);
		pnl.add(jbtDiana);
		pnl.add(jbtDrmundo);
		pnl.add(jbtDraven);
		pnl.add(jbtElise);
		pnl.add(jbtEvelynn);
		pnl.add(jbtEzreal);
		pnl.add(jbtFiddlesticks);
		pnl.add(jbtFiora);
		pnl.add(jbtFizz);
		pnl.add(jbtGalio);
		pnl.add(jbtGangplank);
		pnl.add(jbtGaren);
		pnl.add(jbtGragas);
		pnl.add(jbtGraves);
		pnl.add(jbtHecarim);
		pnl.add(jbtHeimerdinger);
		pnl.add(jbtIrelia);
		pnl.add(jbtJanna);
		pnl.add(jbtJarvenIV);
		pnl.add(jbtJax);
		pnl.add(jbtJayce);
		pnl.add(jbtKarma);
		pnl.add(jbtKarthus);
		pnl.add(jbtKassadin);
		pnl.add(jbtKatarina);
		pnl.add(jbtKayle);
		pnl.add(jbtKennen);
		pnl.add(jbtKhazix);
		pnl.add(jbtKogmaw);
		pnl.add(jbtLeblanc);
		pnl.add(jbtLeesin);
		pnl.add(jbtLeona);
		pnl.add(jbtLulu);
		pnl.add(jbtLux);
		pnl.add(jbtMalphite);
		pnl.add(jbtMalzahar);
		pnl.add(jbtMaokai);
		pnl.add(jbtMasteryi);
		pnl.add(jbtMissfortune);
		pnl.add(jbtMordekaiser);
		pnl.add(jbtMorgana);
		pnl.add(jbtNami);
		pnl.add(jbtNasus);
		pnl.add(jbtNautilus);
		pnl.add(jbtNidalee);
		pnl.add(jbtNocturne);
		pnl.add(jbtNunu);
		pnl.add(jbtOlaf);
		pnl.add(jbtOrianna);
		pnl.add(jbtPantheon);
		pnl.add(jbtPoppy);
		pnl.add(jbtRammus);
		pnl.add(jbtRenekton);
		pnl.add(jbtRengar);
		pnl.add(jbtRiven);
		pnl.add(jbtRumble);
		pnl.add(jbtRyze);
		pnl.add(jbtSejuani);
		pnl.add(jbtShaco);
		pnl.add(jbtShen);
		pnl.add(jbtShyvana);
		pnl.add(jbtSinged);
		pnl.add(jbtSion);
		pnl.add(jbtSivir);
		pnl.add(jbtSkarner);
		pnl.add(jbtSona);
		pnl.add(jbtSoraka);
		pnl.add(jbtSwain);
		pnl.add(jbtSyndra);
		pnl.add(jbtTalon);
		pnl.add(jbtTaric);
		pnl.add(jbtTeemo);
		pnl.add(jbtThresh);
		pnl.add(jbtTristana);
		pnl.add(jbtTrundle);
		pnl.add(jbtTryndamere);
		pnl.add(jbtTwistedfate);
		pnl.add(jbtTwitch);
		pnl.add(jbtUdyr);
		pnl.add(jbtUrgot);
		pnl.add(jbtVarus);
		pnl.add(jbtVayne);
		pnl.add(jbtVeigar);
		pnl.add(jbtVi);
		pnl.add(jbtViktor);
		pnl.add(jbtVladimir);
		pnl.add(jbtVolibear);
		pnl.add(jbtWarwick);
		pnl.add(jbtWukong);
		pnl.add(jbtXerath);
		pnl.add(jbtXinzhao);
		pnl.add(jbtYorick);
		pnl.add(jbtZed);
		pnl.add(jbtZiggs);
		pnl.add(jbtZilean);
		pnl.add(jbtZyra);		
	}
	
	/**
	 * Getter for Champion Button
	 */
	public JButton getAhri(){
		return jbtAhri;
	}	

	/**
	 * Getter for Champion Button
	 */
	public JButton getAkali(){
		return jbtAkali;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getAlistar(){
		return jbtAlistar;
	}	

	/**
	 * Getter for Champion Button
	 */
	public JButton getAmumu(){
		return jbtAmumu;
	}	

	/**
	 * Getter for Champion Button
	 */
	public JButton getAnivia(){
		return jbtAnivia;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getAnnie(){
		return jbtAnnie;
	}	

	/**
	 * Getter for Champion Button
	 */
	public JButton getAshe(){
		return jbtAshe;
	}	

	/**
	 * Getter for Champion Button
	 */
	public JButton getBlitzcrank(){
		return jbtBlitzcrank;
	}	

	/**
	 * Getter for Champion Button
	 */
	public JButton getBrand(){
		return jbtBrand;
	}	

	/**
	 * Getter for Champion Button
	 */
	public JButton getCaitlyn(){
		return jbtCaitlyn;
	}	

	/**
	 * Getter for Champion Button
	 */
	public JButton getCassiopeia(){
		return jbtCassiopeia;
	}	

	/**
	 * Getter for Champion Button
	 */
	public JButton getChogath(){
		return jbtChogath;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getCorki(){
		return jbtCorki;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getDarius(){
		return jbtDarius;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getDiana(){
		return jbtDiana;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getDrmundo(){
		return jbtDrmundo;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getDraven(){
		return jbtDraven;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getElise(){
		return jbtElise;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getEvelynn(){
		return jbtEvelynn;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getEzreal(){
		return jbtEzreal;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getFiddlesticks(){
		return jbtFiddlesticks;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getFiora(){
		return jbtFiora;
	}	

	/**
	 * Getter for Champion Button
	 */
	public JButton getFizz(){
		return jbtFizz;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getGalio(){
		return jbtGalio;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getGangplank(){
		return jbtGangplank;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getGaren(){
		return jbtGaren;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getGragas(){
		return jbtGragas;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getGraves(){
		return jbtGraves;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getHecarim(){
		return jbtHecarim;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getHeimerdinger(){
		return jbtHeimerdinger;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getIrelia(){
		return jbtIrelia;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getJanna(){
		return jbtJanna;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getJarvenIV(){
		return jbtJarvenIV;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getJax(){
		return jbtJax;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getJayce(){
		return jbtJayce;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getKarma(){
		return jbtKarma;
	}
	
	/**
	 * Getter for Champion Button
	 */
	public JButton getKarthus(){
		return jbtKarthus;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getKassadin(){
		return jbtKassadin;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getKatarina(){
		return jbtKatarina;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getKayle(){
		return jbtKayle;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getKennen(){
		return jbtKennen;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getKhazix(){
		return jbtKhazix;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getKogmaw(){
		return jbtKogmaw;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getLeblanc(){
		return jbtLeblanc;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getLeesin(){
		return jbtLeesin;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getLeona(){
		return jbtLeona;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getLulu(){
		return jbtLulu;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getLux(){
		return jbtLux;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getMalphite(){
		return jbtMalphite;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getMalzahar(){
		return jbtMalzahar;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getMaokai(){
		return jbtMaokai;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getMasteryi(){
		return jbtMasteryi;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getMissfortune(){
		return jbtMissfortune;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getMordekaiser(){
		return jbtMordekaiser;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getMorgana(){
		return jbtMorgana;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getNami(){
		return jbtNami;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getNasus(){
		return jbtNasus;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getNautilus(){
		return jbtNautilus;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getNidalee(){
		return jbtNidalee;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getNocturne(){
		return jbtNocturne;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getNunu(){
		return jbtNunu;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getOlaf(){
		return jbtOlaf;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getOrianna(){
		return jbtOrianna;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getPantheon(){
		return jbtPantheon;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getPoppy(){
		return jbtPoppy;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getRammus(){
		return jbtRammus;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getRenekton(){
		return jbtRenekton;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getRengar(){
		return jbtRengar;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getRiven(){
		return jbtRiven;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getRumble(){
		return jbtRumble;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getRyze(){
		return jbtRyze;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getSejuani(){
		return jbtSejuani;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getShaco(){
		return jbtShaco;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getShen(){
		return jbtShen;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getShyvana(){
		return jbtShyvana;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getSinged(){
		return jbtSinged;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getSion(){
		return jbtSion;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getSivir(){
		return jbtSivir;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getSkarner(){
		return jbtSkarner;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getSona(){
		return jbtSona;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getSoraka(){
		return jbtSoraka;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getSwain(){
		return jbtSwain;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getSyndra(){
		return jbtSyndra;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getTalon(){
		return jbtTalon;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getTaric(){
		return jbtTaric;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getTeemo(){
		return jbtTeemo;
	}
	
	/**
	 * Getter for Champion Button
	 */
	public JButton getThresh(){
		return jbtThresh;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getTristana(){
		return jbtTristana;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getTrundle(){
		return jbtTrundle;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getTryndamere(){
		return jbtTryndamere;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getTwistedfate(){
		return jbtTwistedfate;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getTwitch(){
		return jbtTwitch;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getUdyr(){
		return jbtUdyr;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getUrgot(){
		return jbtUrgot;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getVarus(){
		return jbtVarus;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getVayne(){
		return jbtVayne;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getVeigar(){
		return jbtVeigar;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getVi(){
		return jbtVi;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getViktor(){
		return jbtViktor;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getVladimir(){
		return jbtVladimir;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getVolibear(){
		return jbtVolibear;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getWarwick(){
		return jbtWarwick;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getWukong(){
		return jbtWukong;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getXerath(){
		return jbtXerath;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getXinzhao(){
		return jbtXinzhao;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getYorick(){
		return jbtYorick;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getZed(){
		return jbtZed;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getZiggs(){
		return jbtZiggs;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getZilean(){
		return jbtZilean;
	}

	/**
	 * Getter for Champion Button
	 */
	public JButton getZyra(){
		return jbtZyra;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
}
