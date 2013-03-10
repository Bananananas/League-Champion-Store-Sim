package Views;
import Model.LDCModel;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class LDCChampionView extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private LDCModel model;

	private JPanel jplChampStats = new JPanel();
	private JPanel jplStore = new JPanel();
	private JPanel jplItems = new JPanel();
	private JPanel jplInventory = new JPanel();
	
	private JLabel jlbName = new JLabel();
	private JLabel jlbHealth = new JLabel();
	private JLabel jlbArmor = new JLabel();
	private JLabel jlbMagicResist = new JLabel();
	private JLabel jlbHealthRegen = new JLabel();
	private JLabel jlbTenacity = new JLabel();
	private JLabel jlbDamage = new JLabel();
	private JLabel jlbCriticalStrike = new JLabel();
	private JLabel jlbAttackSpeed = new JLabel();
	private JLabel jlbLifeSteal = new JLabel();
	private JLabel jlbAbilityPower = new JLabel();
	private JLabel jlbCooldownReduction = new JLabel();
	private JLabel jlbSpellVamp = new JLabel();
	private JLabel jlbMana = new JLabel();
	private JLabel jlbManaRegen = new JLabel();
	private JLabel jlbMoveSpeed = new JLabel();	
	private JLabel jlbLevel = new JLabel();
	private JLabel jlbArp = new JLabel();
	private JLabel jlbMpen = new JLabel();
	private JSpinner spinner = new JSpinner();
	
	private JButton item1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/inventoryslot.png")));
	private JButton item2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/inventoryslot.png")));
	private JButton item3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/inventoryslot.png")));
	private JButton item4 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/inventoryslot.png")));
	private JButton item5 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/inventoryslot.png")));
	private JButton item6 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/inventoryslot.png")));	
	private JButton back = new JButton("Return to Champ Select");
	private JLabel inventory = new JLabel("Inventory");
	
	private JButton jbtAbyssalScepter = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Abyssal_Scepter.gif")));
	private JButton jbtAegisOfTheLegion = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Aegis_of_the_Legion.gif")));
	private JButton jbtAmplifyingTome = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Amplifying_Tome.gif")));
	private JButton jbtArchangelsStaff = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Archangel's_Staff.gif")));
	private JButton jbtAthenesUnholyGrail = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Athene's_Unholy_Grail.gif")));
	private JButton jbtAtmasImpaler = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Atma's_Impaler.gif")));
	private JButton jbtAugmentDeath = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Augment-_Death.gif")));
	private JButton jbtAugmentGravity = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Augment-_Gravity.gif")));
	private JButton jbtAugmentPower = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Augment-_Power.gif")));
	private JButton jbtAvariceBlade = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Avarice_Blade.gif")));
	private JButton jbtBFSword = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/B._F._Sword.gif")));
	private JButton jbtBannerOfCommand = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Banner_of_Command.gif")));
	private JButton jbtBansheesVeil = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Banshee's_Veil.gif")));
	private JButton jbtBerserkersGreaves = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Berserker's_Greaves.gif")));
	private JButton jbtBilgewaterCutlass = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Bilgewater_Cutlass.gif")));
	private JButton jbtBladeOfTheRuinedKing = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Blade_of_the_Ruined_King.gif")));
	private JButton jbtBlastingWand = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Blasting_Wand.gif")));
	private JButton jbtBonetoothNecklace = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Bonetooth_Necklace.gif")));
	private JButton jbtBootsOfMobility = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Boots_of_Mobility.gif")));
	private JButton jbtBootsOfSpeed = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Boots_of_Speed.gif")));
	private JButton jbtBootsOfSwiftness = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Boots_of_Swiftness.gif")));
	private JButton jbtBrawlersGloves = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Brawler's_Gloves.gif")));
	private JButton jbtCatalystTheProtector = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Catalyst_the_Protector.gif")));
	private JButton jbtChainVest = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Chain_Vest.gif")));
	private JButton jbtChaliceOfHarmony = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Chalice_of_Harmony.gif")));
	private JButton jbtCloakOfAgility = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Cloak_of_Agility.gif")));
	private JButton jbtClothArmor = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Cloth_Armor.gif")));
	private JButton jbtCrystalineFlask = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Crystalline_Flask.gif")));
	private JButton jbtDagger = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Dagger.gif")));
	private JButton jbtDeathfireGrasp = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Deathfire_Grasp.gif")));
	private JButton jbtDoransBlade = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Doran's_Blade.gif")));
	private JButton jbtDoransRing = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Doran's_Ring.gif")));
	private JButton jbtDoransShield = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Doran's_Shield.gif")));
	private JButton jbtEleisasMiracle = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Eleisa's_Miracle.gif")));
	private JButton jbtElixirOfBrilliance = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Elixir_of_Brilliance.gif")));
	private JButton jbtElixirOfFortitude = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Elixir_of_Fortitude.gif")));
	private JButton jbtEmblemOfValor = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Emblem_of_Valor.gif")));
	private JButton jbtExecutionersCalling = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Executioner's_Calling.gif")));
	private JButton jbtFaerieCharm = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Faerie_Charm.gif")));
	private JButton jbtFiendishCodex = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Fiendish_Codex.gif")));
	private JButton jbtFrozenHeart = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Frozen_Heart.gif")));
	private JButton jbtFrozenMallet = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Frozen_Mallet.gif")));
	private JButton jbtGiantsBelt = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Giant's_Belt.gif")));
	private JButton jbtGlacialShroud = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Glacial_Shroud.gif")));
	private JButton jbtGuardianAngel = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Guardian_Angel.gif")));
	private JButton jbtGuinsoosRageblade = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Guinsoo's_Rageblade.gif")));
	private JButton jbtHauntingGuise = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Haunting_Guise.gif")));
	private JButton jbtHealthPotion = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Health_Potion.gif")));
	private JButton jbtHexdrinker = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Hexdrinker.gif")));
	private JButton jbtHextechGunblade = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Hextech_Gunblade.gif")));
	private JButton jbtHextechRevolver = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Hextech_Revolver.gif")));
	private JButton jbtHuntersMachete = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Hunter's_Machete.gif")));
	private JButton jbtIcebornGauntlet = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Iceborn_Gauntlet.gif")));
	private JButton jbtInfinityEdge = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Infinity_Edge.gif")));
	private JButton jbtIonianBootsOfLucidity = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ionian_Boots_of_Lucidity.gif")));
	private JButton jbtKagesLuckyPick = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Kage's_Lucky_Pick.gif")));
	private JButton jbtKindlegem = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Kindlegem.gif")));
	private JButton jbtLastWhisper = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Last_Whisper.gif")));
	private JButton jbtLiandrysTorment = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Liandry's_Torment.gif")));
	private JButton jbtLichBane = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Lich_Bane.gif")));
	private JButton jbtLocketOfTheIronSolari = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Locket_of_the_Iron_Solari.gif")));
	private JButton jbtLongSword = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Long_Sword.gif")));
	private JButton jbtMadredsRazor = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Madred's_Razors.gif")));
	private JButton jbtMalady = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Malady.gif")));
	private JButton jbtManaManipulator = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Mana_Manipulator.gif")));
	private JButton jbtManaPotion = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Mana_Potion.gif")));
	private JButton jbtManamune = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Manamune.gif")));
	private JButton jbtMawOfMalmortius = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Maw_of_Malmortius.gif")));
	private JButton jbtMejaisSoulstealer = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Mejai's_Soulstealer.gif")));
	private JButton jbtMercurialScimitar = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Mercurial_Scimitar.gif")));
	private JButton jbtMercurysTreads = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Mercury_Treads.gif")));
	private JButton jbtMikaelsCrucibal = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/MikaelsCrucibal.gif")));
	private JButton jbtMorellonomicon = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Morellonomicon.gif")));
	private JButton jbtMuramana = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Muramana.gif")));
	private JButton jbtNashorsTooth = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Nashor's_Tooth.gif")));
	private JButton jbtNeedlesslyLargeRod = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Needlessly_Large_Rod.gif")));
	private JButton jbtNegatronCloak = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Negatron_Cloak.gif")));
	private JButton jbtNinjaTabi = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ninja_Tabi.gif")));
	private JButton jbtNullMagicMantle = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Null-Magic_Mantle.gif")));
	private JButton jbtOhmwrecker = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ohmwrecker.gif")));
	private JButton jbtOraclesElixir = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/OraclesElixer.gif")));
	private JButton jbtPhage = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Phage.gif")));
	private JButton jbtPhantomDancer = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Phantom_Dancer.gif")));
	private JButton jbtPhilsophersStone = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Philosopher's_Stone.gif")));
	private JButton jbtPickaxe = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Pickaxe.gif")));
	private JButton jbtQuicksilverSash = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Quicksilver_Sash.gif")));
	private JButton jbtRabadonsDeathcap = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Rabadon's_Deathcap.gif")));
	private JButton jbtRanduinsOmen = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Randuins_Omen.gif")));
	private JButton jbtRavenousHydra = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ravenous_Hydra.gif")));
	private JButton jbtRecurveBow = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Recurve_Bow.gif")));
	private JButton jbtRejuvenationBead = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Rejuvenation_Bead.gif")));
	private JButton jbtRodOfAges = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Rod_of_Ages.gif")));
	private JButton jbtRubyCrystal = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ruby_Crystal.gif")));
	private JButton jbtRubySightstone = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Ruby_Sightstone.gif")));
	private JButton jbtRunaansHurricane = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Runaan's_Hurricane.gif")));
	private JButton jbtRunicBulwark = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Runic_Bulwark.gif")));
	private JButton jbtRylaisCrystalScepter = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Rylai's_Crystal_Scepter.gif")));
	private JButton jbtSapphireCrystal = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sapphire_Crystal.gif")));
	private JButton jbtSeraphsEmbrace = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Seraph's_Embrace.gif")));
	private JButton jbtShardOfTrueIce = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Shard_of_True_Ice.gif")));
	private JButton jbtSheen = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sheen.gif")));
	private JButton jbtShurelyasReverie = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Shurelya's_Reverie.gif")));
	private JButton jbtSightward = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sight_Ward.gif")));
	private JButton jbtSightstone = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sightstone.gif")));
	private JButton jbtSorcerersShoes = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sorcerer's_Shoes.gif")));
	private JButton jbtSpiritOfTheAncientGolem = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Spirit_of_the_Ancient_Golem.gif")));
	private JButton jbtSpiritOfTheElderLizard = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Spirit_of_the_Elder_Lizard.gif")));
	private JButton jbtSpiritOfTheSpectralWraith = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Spirit_of_the_Spectral_Wraith.gif")));
	private JButton jbtSpiritStone = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Spirit_Stone.gif")));
	private JButton jbtSpiritVisage = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Spirit_Visage.gif")));
	private JButton jbtStatikkShiv = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Statikk_Shiv.gif")));
	private JButton jbtStinger = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Stinger.gif")));
	private JButton jbtSunfireCape = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sunfire_Cape.gif")));
	private JButton jbtSwordOfTheDivine = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sword_of_the_Divine.gif")));
	private JButton jbtSwordOfTheOccult = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Sword_of_the_Occult.gif")));
	private JButton jbtTearOfTheGoddess = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Tear_of_the_Goddess.gif")));
	private JButton jbtTheBlackCleaver = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/The_Black_Cleaver.gif")));
	private JButton jbtTheBloodthirster = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/The_Bloodthirster.gif")));
	private JButton jbtTheBrutilizer = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/The_Brutalizer.gif")));
	private JButton jbtTheHexCore = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/The_Hex_Core.gif")));
	private JButton jbtThornmail = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Thornmail.gif")));
	private JButton jbtTiamat = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Tiamat.gif")));
	private JButton jbtTrinityForce = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Trinity_Force.gif")));
	private JButton jbtTwinShadows = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Twin_Shadows.gif")));
	private JButton jbtVampiricScepter = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Vampiric_Scepter.gif")));
	private JButton jbtVisionWard = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Vision_Ward.gif")));
	private JButton jbtVoidStaff = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Void_Staff.gif")));
	private JButton jbtWardensMail = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Warden's_Mail.gif")));
	private JButton jbtWarmogsArmor = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Warmog's_Armor.gif")));
	private JButton jbtWillOfTheAncients = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Will_of_the_Ancients.gif")));
	private JButton jbtWitsEnd = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Wit's_End.gif")));
	private JButton jbtWrigglesLantern = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Wriggle's_Lantern.gif")));
	private JButton jbtYoumuusGhostBlade = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Youmuu's_Ghostblade.gif")));
	private JButton jbtZeal = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Zeal.gif")));
	private JButton jbtZekesHerald = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Zeke's_Herald.gif")));
	private JButton jbtZephyr = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Zephyr.gif")));
	private JButton jbtZhonyasHourglass = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/Zhonya's_Hourglass.gif")));	
	
	/**
	 * Constructor
	 */
	public LDCChampionView(){
				
		jplStore.setLayout(new BorderLayout());
		jplStore.add(jplItems, BorderLayout.CENTER);
		jplStore.add(jplInventory, BorderLayout.SOUTH);
		
		SpinnerModel model = new SpinnerNumberModel(18,1,18,1);
		spinner.setModel(model);	
		
		jplChampStats.setLayout(new GridBagLayout());
		addChampStats();
		
		jplInventory.setLayout(new GridBagLayout());		
		addInventory();
		
		GridLayout layout = new GridLayout(10,10);
		jplItems.setLayout(layout);
		addItems();
		
		setTitle("League of Legends Champion Simulator");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JSplitPane divided = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jplChampStats, jplStore);		
		divided.setDividerLocation(200);
		add(divided);
		
		pack();
		setToolTips();
		setSize(1000, 750);
		
	}		
	
	
	/**
	 * Sets the model for the view.
	 * @param model
	 */
	public void setModel(LDCModel model){
		
		this.model = model;
		
	}
	
	////////////////////////////////////
	///Adding Components to the Frame///
	////////////////////////////////////
	
	
	/**
	 * Adds all of the Jlabels that display champion statistics to the frame.
	 */
	public void addChampStats(){
		
		JLabel filler = new JLabel();
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.NORTHWEST;
		
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		jplChampStats.add(jlbName, c);
		
		c.gridy = 1;
		jplChampStats.add(jlbHealth, c);

		c.gridy = 2;
		jplChampStats.add(jlbMana, c);

		c.gridy = 3;
		jplChampStats.add(jlbArmor, c);

		c.gridy = 4;
		jplChampStats.add(jlbMagicResist, c);

		c.gridy = 5;
		jplChampStats.add(jlbDamage, c);
		
		c.gridy = 6;
		jplChampStats.add(jlbArp, c);

		c.gridy = 7;
		jplChampStats.add(jlbAbilityPower, c);
		
		c.gridy = 8;
		jplChampStats.add(jlbMpen, c);

		c.gridy = 9;
		jplChampStats.add(jlbHealthRegen, c);

		c.gridy = 10;
		jplChampStats.add(jlbManaRegen, c);

		c.gridy = 11;
		jplChampStats.add(jlbAttackSpeed, c);

		c.gridy = 12;
		jplChampStats.add(jlbCriticalStrike, c);	

		c.gridy = 13;
		jplChampStats.add(jlbLifeSteal, c);

		c.gridy = 14;
		jplChampStats.add(jlbSpellVamp, c);

		c.gridy = 15;
		jplChampStats.add(jlbCooldownReduction, c);

		c.gridy = 16;
		jplChampStats.add(jlbTenacity, c);	

		c.gridy = 17;
		jplChampStats.add(jlbMoveSpeed, c);

		c.gridy = 18;
		jplChampStats.add(jlbLevel, c);
		
		c.gridx = 1;
		c.gridy = 18;
		jplChampStats.add(spinner, c);
		
		c.gridy = 19;
		jplChampStats.add(filler, c);
		
		c.gridy = 20;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 21;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 22;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 23;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 24;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 25;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 26;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 27;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 28;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 29;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 30;
		jplChampStats.add(filler = new JLabel(), c);
		
		c.gridy = 31;
		jplChampStats.add(filler = new JLabel(), c);		
		
	}
	
	/**
	 * Adds the inventory slots to the frame.
	 */
	public void addInventory(){
		
		GridBagConstraints c = new GridBagConstraints();
		JLabel filler = new JLabel("");
		
		c.gridx = 0;
		c.gridy = 0;
		jplInventory.add(inventory, c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.ipadx = -29;
		c.ipady = -9;
		jplInventory.add(item1, c);
		
		c.gridx = 2;
		jplInventory.add(item2, c);
		
		c.gridx = 3;
		jplInventory.add(item3, c);
		
		c.gridx = 4;
		jplInventory.add(item4, c);
		
		c.gridx = 5;
		jplInventory.add(item5, c);
		
		c.gridx = 6;
		jplInventory.add(item6, c);
		
		c.ipadx = 109;
		c.gridx = 7;
		jplInventory.add(filler, c);
		
		c.ipadx = 5;
		c.ipady = 5;
		c.gridx =8;
		jplInventory.add(back, c);
	}
	
	/**
	 * Adds all of the items buttons to the items panel.
	 */
	public void addItems(){
		
		jplItems.add(jbtAbyssalScepter);
		jplItems.add(jbtAegisOfTheLegion);
		jplItems.add(jbtAmplifyingTome);
		jplItems.add(jbtArchangelsStaff);
		jplItems.add(jbtAthenesUnholyGrail);
		jplItems.add(jbtAtmasImpaler);
		//jplItems.add(jbtAugmentDeath);
		//jplItems.add(jbtAugmentGravity);
		//jplItems.add(jbtAugmentPower);
		jplItems.add(jbtAvariceBlade);
		jplItems.add(jbtBFSword);
		jplItems.add(jbtBannerOfCommand);
		jplItems.add(jbtBansheesVeil);
		jplItems.add(jbtBerserkersGreaves);
		jplItems.add(jbtBilgewaterCutlass);
		jplItems.add(jbtBladeOfTheRuinedKing);
		jplItems.add(jbtBlastingWand);
		//jplItems.add(jbtBonetoothNecklace);
		jplItems.add(jbtBootsOfMobility);
		jplItems.add(jbtBootsOfSpeed);
		jplItems.add(jbtBootsOfSwiftness);
		jplItems.add(jbtBrawlersGloves);
		jplItems.add(jbtCatalystTheProtector);
		jplItems.add(jbtChainVest);
		jplItems.add(jbtChaliceOfHarmony);
		jplItems.add(jbtCloakOfAgility);
		jplItems.add(jbtClothArmor);
		jplItems.add(jbtCrystalineFlask);
		jplItems.add(jbtDagger);
		jplItems.add(jbtDeathfireGrasp);
		jplItems.add(jbtDoransBlade);
		jplItems.add(jbtDoransRing);
		jplItems.add(jbtDoransShield);
		jplItems.add(jbtEleisasMiracle);
		//jplItems.add(jbtElixirOfBrilliance);
		//jplItems.add(jbtElixirOfFortitude);
		jplItems.add(jbtEmblemOfValor);
		jplItems.add(jbtExecutionersCalling);
		jplItems.add(jbtFaerieCharm);
		jplItems.add(jbtFiendishCodex);
		jplItems.add(jbtFrozenHeart);
		jplItems.add(jbtFrozenMallet);
		jplItems.add(jbtGiantsBelt);
		jplItems.add(jbtGlacialShroud);
		jplItems.add(jbtGuardianAngel);
		jplItems.add(jbtGuinsoosRageblade);
		jplItems.add(jbtHauntingGuise);
		//jplItems.add(jbtHealthPotion);
		jplItems.add(jbtHexdrinker);
		jplItems.add(jbtHextechGunblade);
		jplItems.add(jbtHextechRevolver);
		jplItems.add(jbtHuntersMachete);
		jplItems.add(jbtIcebornGauntlet);
		jplItems.add(jbtInfinityEdge);
		jplItems.add(jbtIonianBootsOfLucidity);
		jplItems.add(jbtKagesLuckyPick);
		jplItems.add(jbtKindlegem);
		jplItems.add(jbtLastWhisper);
		jplItems.add(jbtLiandrysTorment);
		jplItems.add(jbtLichBane);
		jplItems.add(jbtLocketOfTheIronSolari);
		jplItems.add(jbtLongSword);
		jplItems.add(jbtMadredsRazor);
		jplItems.add(jbtMalady);
		jplItems.add(jbtManaManipulator);
		//jplItems.add(jbtManaPotion);
		jplItems.add(jbtManamune);
		jplItems.add(jbtMawOfMalmortius);
		jplItems.add(jbtMejaisSoulstealer);
		jplItems.add(jbtMercurialScimitar);
		jplItems.add(jbtMercurysTreads);
		jplItems.add(jbtMikaelsCrucibal);
		jplItems.add(jbtMorellonomicon);
		jplItems.add(jbtMuramana);
		jplItems.add(jbtNashorsTooth);
		jplItems.add(jbtNeedlesslyLargeRod);
		jplItems.add(jbtNegatronCloak);
		jplItems.add(jbtNinjaTabi);
		jplItems.add(jbtNullMagicMantle);
		jplItems.add(jbtOhmwrecker);
		//jplItems.add(jbtOraclesElixir);
		jplItems.add(jbtPhage);
		jplItems.add(jbtPhantomDancer);
		jplItems.add(jbtPhilsophersStone);
		jplItems.add(jbtPickaxe);
		jplItems.add(jbtQuicksilverSash);
		jplItems.add(jbtRabadonsDeathcap);
		jplItems.add(jbtRanduinsOmen);
		jplItems.add(jbtRavenousHydra);
		jplItems.add(jbtRecurveBow);
		jplItems.add(jbtRejuvenationBead);
		jplItems.add(jbtRodOfAges);
		jplItems.add(jbtRubyCrystal);
		jplItems.add(jbtRubySightstone);
		jplItems.add(jbtRunaansHurricane);
		jplItems.add(jbtRunicBulwark);
		jplItems.add(jbtRylaisCrystalScepter);
		jplItems.add(jbtSapphireCrystal);
		jplItems.add(jbtSeraphsEmbrace);
		jplItems.add(jbtShardOfTrueIce);
		jplItems.add(jbtSheen );
		jplItems.add(jbtShurelyasReverie);
		//jplItems.add(jbtSightward);
		jplItems.add(jbtSightstone);
		jplItems.add(jbtSorcerersShoes);
		jplItems.add(jbtSpiritOfTheAncientGolem);
		jplItems.add(jbtSpiritOfTheElderLizard);
		jplItems.add(jbtSpiritOfTheSpectralWraith);
		jplItems.add(jbtSpiritStone);
		jplItems.add(jbtSpiritVisage);
		jplItems.add(jbtStatikkShiv);
		jplItems.add(jbtStinger);
		jplItems.add(jbtSunfireCape);
		jplItems.add(jbtSwordOfTheDivine);
		jplItems.add(jbtSwordOfTheOccult);
		jplItems.add(jbtTearOfTheGoddess);
		jplItems.add(jbtTheBlackCleaver);
		jplItems.add(jbtTheBloodthirster);
		jplItems.add(jbtTheBrutilizer);
		//jplItems.add(jbtTheHexCore);
		jplItems.add(jbtThornmail);
		jplItems.add(jbtTiamat);
		jplItems.add(jbtTrinityForce);
		jplItems.add(jbtTwinShadows);
		jplItems.add(jbtVampiricScepter);
		//jplItems.add(jbtVisionWard);
		jplItems.add(jbtVoidStaff);
		jplItems.add(jbtWardensMail);
		jplItems.add(jbtWarmogsArmor);
		jplItems.add(jbtWillOfTheAncients);
		jplItems.add(jbtWitsEnd);
		jplItems.add(jbtWrigglesLantern);
		jplItems.add(jbtYoumuusGhostBlade);
		jplItems.add(jbtZeal);
		jplItems.add(jbtZekesHerald);
		jplItems.add(jbtZephyr);
		jplItems.add(jbtZhonyasHourglass);
	}

	/**
	 * Adds Viktors items to the store.
	 */
	public void addViktorItems(){
		jplItems.add(jbtAugmentDeath);
		jplItems.add(jbtAugmentGravity);
		jplItems.add(jbtAugmentPower);
	}
	
	/**
	 * Removes Viktors items from the store.
	 */
	public void removeViktorItems(){
		jplItems.remove(jbtAugmentDeath);
		jplItems.remove(jbtAugmentGravity);
		jplItems.remove(jbtAugmentPower);
	}
	
	/**
	 * Adds Rengars items to the store.
	 */
	public void addRengarItems(){
		jplItems.add(jbtBonetoothNecklace);
	}
	
	/**
	 * Removes Rengars items from the store;
	 */
	public void removeRengarItems(){
		jplItems.remove(jbtBonetoothNecklace);
	}
	
	/**
	 * Sets the tool tips for all of the items.
	 */
	public void setToolTips(){
		
		jbtAbyssalScepter.setToolTipText("<html>" + "2650g" + "<br>" + "Abyssal Scepter" + "<br>" +"+70 Ability Power"+ "<br>" + "+45 Magic Resist" + "<br>" + 
				"Unique: Reduces the magic resist of nearby enemies by 20." + "<html>");
		jbtAegisOfTheLegion.setToolTipText("<html>" + "2150g" + "<br>" + "Aegis of the Legion" + "<br>" + "+250 Health"+ "<br>" + "+20 Armor" + "<br>" + "+20 Magic Resistance" + "<br>" + "Unique - Legion: Nearby allies gain +10 Armor, +15 Magic resist, and +10 Health regen per 5 seconds." + "<html>");
		jbtAmplifyingTome.setToolTipText("<html>" + "435g" + "<br>" + "Amplifying Tome" + "<br>" + "+20 Ability Power"+ "<html>");
		jbtArchangelsStaff.setToolTipText("<html>" + "2700g" + "<br>" + "Archangel's Staff" + "<br>" +"+250 Mana"+ "<br>" + "+60 Ability Power" + "<br>" + "+10 Mana Regen per 5 seconds" + "<br>" + "Unique Passive - Insight: Gain Ability Power equal to 3% of your maximum mana."+ 
				"<br>" + "Unique Passive - Mana Charge: Each time you cast a spell or spend mana, you gain 6 maximum mana (3 second cooldown). Bonus caps at +750 mana." + "<html>");
		jbtAthenesUnholyGrail.setToolTipText("<html>" + "2800g" + "<br>" + "Athene's Unholy Grail" + "<br>" + "+60 Ability Power"+ "<br>" + "+40 Magic Resist" + 
				"<br>" + "+15 Mana Regeneral per 5" + "<br>" + "Unique: 15% Cooldown Reduction." + "<br>" + "Unique: Restores 12% of your max mana on kill or assist." + "<br>" 
				+ "Unique Passive - Mana Font: Increases your mana regeneration by 1% per 1% mana you are missing." + "<html>");
		jbtAtmasImpaler.setToolTipText("<html>" + "2300g" + "<br>"+ "Atma's Impaler" + "<br>" + "+45 Armor"+ "<br>" + "+15% Critical Strike Chance" + "<br>" + "Unique: You gain attack damage equal to 1.5% of your maximum health" + "<html>");
		jbtAugmentDeath.setToolTipText("<html>" + "1000g" + "<br>" + "Augment Death" + "<br>" + "+45 Ability Power"+ "<br>" + "Passive: +3 Ability Power per level. Death Ray sets fire to enemies, delaing 30% additional magic damage " +
				"over 4 seconds." + "<html>");
		jbtAugmentGravity.setToolTipText("<html>" + "1000g" + "<br>" + "Augment Gravity" + "<br>" +"+200 Mana"+ "<br>" + "+10% Cooldown Reduction" + "<br>" + "+5 Mana Regeneration per 5 seconds" + "<br>" + 
				"Unique: +3 Ability Power per level. Gravity Field has an additional 30% cast range." + "<html>");
		jbtAugmentPower.setToolTipText("<html>" + "1000g" + "<br>" + "Augment Power" + "<br>" +"+220 Health"+ "<br>" + "+6 Health Regeneration per 5" + "<br>" + 
				"Unique: +3 Ability Power per level. Power Transfer increases Viktor's movement speed by 30% for 3 seconds." + "<html>");
		jbtAvariceBlade.setToolTipText("<html>" + "800g" + "<br>"+ "Avarice Blade" + "<br>" +"+10% Critical Strike Chance" + "<br>" +
				"Unique - Avarice: Gain an additional +2 gold every 10 seconds." + "<br>" +
				"Unique - Greed: Gain an additional +2 gold every kill." + "<html>");
		jbtBFSword.setToolTipText("<html>" + "1550g" + "<br>" + "B.F. Sword" + "<br>" +"+45 Attack Damage"+ "<html>");
		jbtBannerOfCommand.setToolTipText("<html>" + "2400g" + "<br>" + "Banner Of Command" + "<br>" +"+40 Ability Power"+ "<br>" + "+30 Armor" + 
				"<br>" + "+10% Cooldown Reduction" + "<br>" + "Unique - Valor: Nearby allies gain 10 health regen per 5 seconds and nearby allied minions deal 15% increased damage." + 
				"<br>" + "Unique - Promote: Transforms a nearby siege minion to a more powerful unit. You gain all the gold this unit earns. 180 second cooldown." + "<html>");
		jbtBansheesVeil.setToolTipText("<html>" + "2610g" + "<br>" + "Banshee's Veil" + "<br>" + "+400 Health"+ "<br>" + "+300 Mana"  + 
				"<br>" + "+45 Magic Resistance" + "<br>" + "Unique: Gain a spell shield that blocks the next incoming enemy ability. " +
						"This shield refreshes if you haven't taken damage from a champion in 25 seconds." + "<html>");
		jbtBerserkersGreaves.setToolTipText("<html>" + "900g" + "<br>" + "Berserker's Graves" + "<br>"+ "+20% Attack Speed" + "<br>" + "Unique - Enhanced Movement: +45 Movement Speed." + "<html>");
		jbtBilgewaterCutlass.setToolTipText("<html>" + "1925g" + "<br>" + "Bilgewater Cutlass" + "<br>" +"+40 Attack Damage"+ "<br>" + "+10% Life Steal" + "<br>" + "Unique: Deals 150 magic damage" +
				" and slows the target enemy champion's movement speed by 30% for 2 seconds. 60 second cooldown. "+ "<html>");
		jbtBladeOfTheRuinedKing.setToolTipText("<html>" + "2900g" + "<br>" + "Blade of the Ruined King" + "<br>" +"+40 Attack Damage"+ "<br>" + "+10% Life Steal" + "<br>" + "Unique: Your attacks deal 4% of the targets" +
				"current health in physical damage and heals you for half the amount (120 max vs minions)." + "<br>" + "Unique: Drains target champion, dealing 150 physical damage plus 50% of your " +
						"Attack Damage and healing you by the same amount. Additionally you steal 30% of their Movement Speed for 2 seconds - 60 second cooldown."+ "<html>");
		jbtBlastingWand.setToolTipText("<html>" + "860g" + "<br>" + "Blasting Wand" + "<br>"+ "+40 Ability Power" + "<html>");
		jbtBonetoothNecklace.setToolTipText("<html>" + "800g" + "<br>" + "Bonetooth Necklace" + "<br>" +"+5 Attack Damage"+ "<br>" + "Unique: +2 Attack Damage per level" +
				"<br>"+ "Rengar collects trophies when killing champions. Kills and assists grant 1 trophy, and 1 trophy is lost on death." + "<br>" + "3 Trophies: +10 Armor Penetration, +5% Cooldown Reduction" 
				+ "<br>" + "6 Trophies: +25 Movement Speed" + "<br>" + "9 Trophies: Rengar's leap gains 150 bonus range." + "<br>" + "14 Trophies: Thrill of the Hunt's durating is increased to 3 seconds. Additionally Rengar's " +
						"next ability used after activing Thrill of the Hunt gains 1 Ferocity." +  "<html>");
		jbtBootsOfMobility.setToolTipText("<html>" + "1000g" + "<br>"+ "Boots of Mobility" + "<br>" + "Unique - Enhanced Movement: +45 Movement Speed. Increases to +105 Movement Speed when out of combat for 5 seconds." + "<html>");
		jbtBootsOfSpeed.setToolTipText("<html>"  + "350g" + "<br>"+ "Boots of Speed" + "<br>" + "Unique - Enhanced Movement: +25 Movement Speed" + "<html>");
		jbtBootsOfSwiftness.setToolTipText("<html>" + "1000g" + "<br>"+ "Boots of Swiftness" + "<br>" + "Unique - Enhanced Movement: +60 Movement Speed" + "<br>" + "Unique - Slow Resist: Movement slowing effects are reduced by 25%." +"<html>");
		jbtBrawlersGloves.setToolTipText("<html>" + "400g" + "<br>" + "Brawlers Gloves" + "<br>" + "+8% Critical Strike Chance"+ "<html>");
		jbtCatalystTheProtector.setToolTipText("<html>" + "1200g" + "<br>"+ "Catalyst the Protector" + "<br>" + "+200 Health"+ "<br>" + "+300 Mana" + "<br>" + "Unique Passive - Valor's Reward: On leveling up, restores 150 Health and " +
				"200 Mana over 8 seconds." + "<html>");
		jbtChainVest.setToolTipText("<html>" + "720g" + "<br>" + "Chain Vest" + "<br>" +"+40 Armor" + "<html>");
		jbtChaliceOfHarmony.setToolTipText("<html>" + "880g" + "<br>"+ "Chalice of Harmony" + "<br>" + "+25 Magic Resistance"+ "<br>" + "+7 Mana Regeneration per 5 seconds" + 
				"<br>" + "Unique Passive - Mana Font: Increases your mana regeneration by 1% per 1% mana you are missing." + "<html>");
		jbtCloakOfAgility.setToolTipText("<html>" + "730g" + "<br>"+ "Cloak of Agility" + "<br>" + "+15% Critical Strike Chance" + "<html>");
		jbtClothArmor.setToolTipText("<html>" + "300g" + "<br>" + "Cloth Armor" + "<br>" + "+15 Armor" + "<html>");
		jbtCrystalineFlask.setToolTipText("<html>" + "345g" + "<br>"+ "Crystaline Flask" + "<br>" + "Unique: Starts with 3 charges and refills each time you stop by your shop." + "<br>" + "Active: Consumes a charge to restore 120 health" +
				"and 60 mana over 12 seconds." + "<html>");
		jbtDagger.setToolTipText("<html>" + "400g" + "<br>"+ "Dagger" + "<br>" + "+12% Attack Speed"+ "<html>");
		jbtDeathfireGrasp.setToolTipText("<html>" + "3000g" + "<br>"+ "Deathfire Grasp" + "<br>"+"+100 Ability Power"+ "<br>" + "+15% Cooldown Reduction" + "<br>" + 
				"Unique: Deals 15% of target champion's maximum health in magic damage and applies the debuff, Doom." +
				"Doom amplifies all magic damage that champion takes by 20% for 4 seconds. 60 second cooldown." + "<html>");
		jbtDoransBlade.setToolTipText("<html>"  + "475g" + "<br>"+ "Doran's Blade" + "<br>" + "+80 Health"+ "<br>" + "+10 Attack Damage" + "<br>" + "Passive: Your basic attacks restore 5 health each time they hit an enemy." + "<html>");
		jbtDoransRing.setToolTipText("<html>" + "475g" + "<br>"+ "Doran's Ring" + "<br>" + "+80 Health"+ "<br>" + "+15 Ability Power" + "<br>" + "+3 Mana Regen per 5 seconds" + "<br>" + "Passive: Restores 5 Mana when you kill an enemy unit." + "<html>");
		jbtDoransShield.setToolTipText("<html>" + "475g" + "<br>" + "Doran's Shield" + "<br>" + "+100 Health"+ "<br>" + "+5 Armor" + "<br>" + "+5 Health Regen per 5 seconds" + "<br>" + "Unique: Blocks  damage from champion basic attacks." + "<html>");
		jbtEleisasMiracle.setToolTipText("<html>"+ "1100g" + "<br>" + "Eleisa's Miracle" + "<br>" + "+10 Health Regeneration per 5" + "<br>" + "+15 Mana Regeneration per 5" + "<br>" + "Unique Passive - Aid: " +
				"Your Summoner Heal, Revive, and Clairvoyance cooldowns are reduced by 20%" + "<br>" + "Unique Passive - Eleisa's Blessing: If you gain 3 levels with this item, you gail all effects permanently and this item is consumed." + "<html>");
		jbtElixirOfBrilliance.setToolTipText("<html>" + "250g" + "<br>"+ "Elixir of Brilliance" + "<br>" + "On use, grants 25-40 Ability Power, based on champion level, and 10% cooldown reduction for 3 minutes." + "<html>");
		jbtElixirOfFortitude.setToolTipText("<html>" + "250g" + "<br>" + "Elixir of Fortitude" + "<br>" + "On use, grants 120-235 Health, based on champion level, and 15 Attack Damage for 4 minutes." + "<html>");
		jbtEmblemOfValor.setToolTipText("<html>" + "650g" + "<br>"+ "Emblem of Valor" + "<br>" + "+20 Armor"+ "<br>" + "Unique - Valor: Nearby allied champions gain +7 health regen per 5 seconds." + "<html>");
		jbtExecutionersCalling.setToolTipText("<html>" +  "1900g" + "<br>"+ "Executioner's Calling" + "<br>" + "+25 Attack Damage" + "<br>" + "+15% Critical Strike Chance" + "<br>" + "Unique: Your basic attacks inflict Grevous Wounds on enemy champion for 1.5 seconds." + "<html>");
		jbtFaerieCharm.setToolTipText("<html>" +  "180g" + "<br>"+ "Faerie Charm" + "<br>" + "+3 Mana Regen per 5 seconds" + "<html>");
		jbtFiendishCodex.setToolTipText("<html>" +  "1000g" + "<br>"+ "Fiendish Codex" + "<br>"+"+30 Ability Power"+ "<br>" + "+6 Mana Regeneration per 5" + "<br>" + 
				 "Unique: +10% Cooldown Reduction." + "<html>");
		jbtFrozenHeart.setToolTipText("<html>" +  "3100g" + "<br>"+ "Frozen Heart" + "<br>" + "+90 Armor" + "<br>" + "+400 Mana" + "<br>" + "+20% Cooldown Reduction"+ "<br>" + "Unique: Reduces the attack speed of nearby enemies by 20%." + "<html>");
		jbtFrozenMallet.setToolTipText("<html>" +  "3300g" + "<br>"+ "Frozen Mallet" + "<br>" + "+700 Health" + "<br>" + "+30 Attack Damage" + "<br>" + "Unique - Icy: Your basic attacks slow your targets  Movement Speed by 40% for 1.5 seconds (30% slow for ranged attacks)." + "<html>");
		jbtGiantsBelt.setToolTipText("<html>" +  "1000g" + "<br>"+ "Giant's Belt" + "<br>" + "+400 Health" + "<html>");
		jbtGlacialShroud.setToolTipText("<html>" +  "1500g" + "<br>"+ "Glacial Shroud" + "<br>" + "+40 Armor" + "<br>" + "+300 Mana" + "<br>" + "Unique: +15% Cooldown Reduction" + "<html>");
		jbtGuardianAngel.setToolTipText("<html>" +  "2600g" + "<br>"+ "Guardian Angel" + "<br>" + "+50 Armor" + "<br>" + "+30 Magic Resistance" + "<br>" + "Unique: Revives your champion upon death restoring 30% of your maximum health and mana. 5 minute cooldown." + "<html>");
		jbtGuinsoosRageblade.setToolTipText("<html>" +  "2600g" + "<br>"+ "Guinsoo's Rageblade" + "<br>" + "+40 Ability Power" + "<br>" + "+30 Attack Damage" + "<br>" + "Passive: Your basic attacks or spellgasts grant you 4% Attack Speed and 4 Ability Power for 8 seconds. This bonus stacks up to 8 times" +
				"<br>" + "Unique Passive: Falling below 50% Health grants you 20% Attack Speed, 10% Life Steal, and 10% Spell Vamp until you exit combat. 30 second cooldown." + "<html>");
		jbtHauntingGuise.setToolTipText("<html>" +  "1485g" + "<br>"+ "Haunting Guise" + "<br>" + "+200 Health"+ "<br>" + "+25 Ability Power" + "<br>" + "Unique - Eyes of Pain: +15 Magic Penetration." + "<html>");
		jbtHealthPotion.setToolTipText("<html>" +  "35g" + "<br>"+ "Health Potion" + "<br>" + "Restores 150 health over 15 seconds" + "<html>");
		jbtHexdrinker.setToolTipText("<html>" +  "1350g" + "<br>"+ "Hexdrinker" + "<br>" + "+25 Attack Damage" + "<br>" + "+25 Magic Resistance" + "<br>" + "Unique - Lifeline: If you would take magic damage that would leave you at less than 30% of your" +
				"maximum health, you gain a shield which absorbs up to 250 magic damage for 5 seconds. 60 second cooldown." + "<html>");
		jbtHextechGunblade.setToolTipText("<html>" +  "3400g" + "<br>"+ "Hextech Gunblade" + "<br>" + "+45 Attack Damage" + "<br>" + "+65 Ability Power" + "<br>" + "+10% Life Steal" + "<br>"+ "Unique: +20% Spell Vamp" +
				"<br>" + "Unique - Reload: Your basic attacks and single target spells against champions reduce the cooldown of this item by 3 seconds" + "<br>" + "Unique: Deals 150 + 40% of your" +
						"Ability Power as magic damage and slows the target champion's movement speed by 40% for 2 seconds. 60 second cooldown." + "<html>");
		jbtHextechRevolver.setToolTipText("<html>" +  "1200g" + "<br>"+ "Hextech Revolver" + "<br>" + "+40 Ability Power" + "<br>" + "Unique: +12% Spell Vamp" + "<html>");
		jbtHuntersMachete.setToolTipText("<html>" +  "300g" + "<br>"+ "Hunter's Machete" + "<br>" + "Unique Passive - Butcher: Damage dealt to monsters increased by 10%." + "<br>" + "Unique Passive - Rend: Your basic attacks" +
				"deal 10 bonus true damage to monsters." + "<html>");
		jbtIcebornGauntlet.setToolTipText("<html>" +  "3400g" + "<br>"+ "Iceborn Gauntlet" + "<br>" + "+40 Ability Power" + "<br>" + "+500 Mana" + "<br>" + "+60 Armor" + "<br>" + "+15% Cooldown Reduction" + "<br>" + "Unique Passive - Spellblade: " +
				"After using an ability, your next basic attack deals bonus physical damage equtal to 125% of your base attack damage to surroudning enemies and creates a field for 2 seconds that slows enemies" +
				"inside by 30% (2 second cooldown)." + "<html>");
		jbtInfinityEdge.setToolTipText("<html>" + "3800g" + "<br>"+ "Infinity Edge" + "<br>" + "+70 Attack Damage"+ "<br>" + "+25% Critical Strike Chance" + "<br>" + "Unique: +50% Critical Strike Damage." + "<html>");
		jbtIonianBootsOfLucidity.setToolTipText("<html>" +  "1050g" + "<br>"+ "Ionian Boots of Lucidity" + "<br>" + "Unique: +15% Cooldown Reduction"+ "<br>" + "Unique - Enhanced Movement: +45 Movement Speed" + "<html>");
		jbtKagesLuckyPick.setToolTipText("<html>" +  "765g" + "<br>"+ "Kage's Lucky Pick" + "<br>" + "+25 Ability Power"+ "<br>" + "Unique - Lucky Shadow: Gain +4 additional gold ever 10 seconds" + "<html>");
		jbtKindlegem.setToolTipText("<html>" +  "850g" + "<br>"+ "Kindlegem" + "<br>" + "+200 Health"+ "<br>" + "Unique: +10% Cooldown Reduction" + "<html>");
		jbtLastWhisper.setToolTipText("<html>" +  "2300g" + "<br>"+ "Last Whisper" + "<br>" + "+40 Attack Damage"+ "<br>" + "Unique: +35% Armor Penetration." + "<html>");
		jbtLiandrysTorment.setToolTipText("<html>" +  "2900g" + "<br>"+ "Liandry's Torment" + "<br>" + "+300 Health"+ "<br>" + "+60 Ability Power" + "<br>" + "Unique Passive - Eyes of Pain: +15 Magic Penetration" + "<br>" + 
				"Unique Passive: Dealing spell damage burns enemies for 5% of their current health as magic damage over 3 seconds. If their movement is imparied, " +
				"they take double damage from this effect. Multitarget or periodic effects deals 2.5% over 1.5 seconds. 300 max damage vs. monsters" + "<html>");
		jbtLichBane.setToolTipText("<html>" +  "3000g" + "<br>"+ "Lich Bane" + "<br>" + "+80 Ability Power"+ "<br>" + "+250 Mana" + "<br>" + "+5% Movement Speed" + "<br>" + "Unique – Spellblade: After using an ability, your next basic attack deals bonus magic damage equal to 50 + 75% of your ability power. 2 second cooldown." + "<html>");
		jbtLocketOfTheIronSolari.setToolTipText("<html>" +  "2000g" + "<br>"+ "Locket of the Iron Solari" + "<br>" + "+425 Health"+ "<br>" + "+35 Armor"  + "<br>" + "+10% Cooldown Reduction" + "<br>" + "+10 Health Regeneration per 5" + "<br>"
				+ "Unique: Shield yourself and nearby allied champions for 5 seconds, absobing up to 50 (+10 per level) damage. 60 second cooldown" + "<html>");
		jbtLongSword.setToolTipText("<html>" +  "400g" + "<br>"+ "Long Sword" + "<br>" + "+10 Attack Damage" + "<html>");
		jbtMadredsRazor.setToolTipText("<html>" +  "700g" + "<br>"+ "Madred's Razors" + "<br>" + "+25 Armor" + "<br>" + "Unique - Maim: Your basic attacks against minions and monsters have a 25% chance to deal 300 bonus magic damage." +
				"<br>" + "Unique - Rend: Basic attacks deal 10 bonus true damage to monsters." + "<html>");
		jbtMalady.setToolTipText("<html>" +  "2035g" + "<br>"+ "Malady" + "<br>" + "+25 Ability Power" + "<br>" + "+45% Attack Speed" +
				"<br>" + "Unique: Your basic attacks deal 15 + 10% AP bonus magic damage." + "<br>" + "Unique: Your basic attacks reduce enemy magic resistance by 4 for 8 seconds (maximum 7 stacks)." + "<html>");
		jbtManaManipulator.setToolTipText("<html>" +  "400g" + "<br>"+ "Mana Manipulator" + "<br>" + "Unique Aura - Mana Warp: Nearby allied champions gain +6 mana regeneration per 5 seconds." + "<html>");
		jbtManaPotion.setToolTipText("<html>" +  "35g" + "<br>"+ "Mana Potion" + "<br>" + "Restores 100 mana over 15 seconds." + "<html>");		
		jbtManamune.setToolTipText("<html>" +  "2100g" + "<br>"+ "Manamune" + "<br>" + "+250 Mana"+ "<br>" + "+20 Attack Damage" + "<br>" + "+7 Mana Regen per 5 seconds." + "<br>" + 
				"Unique Passive - Awe: Gain attack damage equal to 2% of your maximum mana." + "<br>" + "Unique Passive - Mana Charge: Each time you attack, cast a spell or spend mana, your maximum mana increases by 4 (3 second cooldown). Bonus caps at +750 bonus mana." + "<html>");
		jbtMawOfMalmortius.setToolTipText("<html>" +  "3200g" + "<br>"+ "Maw of Malmortius" + "<br>" + "+55 Attack Damage"+ "<br>" + "+36 Magic Resistance" + "<br>" + "Gain +1 attack damage for every 2.5% health missing." +
				"<br>" + "Unique - Lifeline: If you would take magic damage which would leave you at less than 30% of your maximum health, you first gain a shield which absorbs up to 400 magic damage for 5 seconds. 60 second cooldown." + "<html>");
		jbtMejaisSoulstealer.setToolTipText("<html>" +  "1235g" + "<br>"+ "Mejai's Soulstealer" + "<br>" + "+20 Ability Power"+ "<br>" + "Unique: Your champion gains 8 Ability Power per stack, receiving 2 stacks for a kill or 1 stack for an assist." +
				"This effect can stack 20 times; you lose a third of your stacks if you die. At 20 stacks, your champion gains 15% cooldown reduction" + "<html>");
		jbtMercurialScimitar.setToolTipText("<html>" +  "3810g" + "<br>"+ "Mercurial Scimitar" + "<br>" + "+60 Attack Damage"+ "<br>" + "+45 Magic Resist" + "<br>" + "Unique Active - Quicksilver: Removes all debuffs from your " +
				"champion. Melee champions also gain +50% movement speed for 1 second. 90 second cooldown." + "<html>");
		jbtMercurysTreads.setToolTipText("<html>" +  "1200g" + "<br>"+ "Mercury's Treads" + "<br>" + "+25 Magic Resistance" + "<br>" + "Unique – Enhanced Movement: +45 movement speed" +
				"<br>" + "Unique – Tenacity: The duration of stuns, slows, taunts, fears, silences, blinds and immobilizes are reduced by 35%." + "<html>");
		jbtMikaelsCrucibal.setToolTipText("<html>" +  "2200g" + "<br>"+ "Mikael's Crucible" + "<br>" + "+300 Mana" + "<br>" + "+40 Magic Resistance" +
				"<br>" + "+9 Mana Regeneration per 5 seconds" + "<br>" + "Unique Passive - Mana Font: Increases your Mana Regen by 1% per 1% Mana you are missing" + "<br>" + "Unique Active: Removes all stuns, roots, taunts, " +
						"fears, silences and slows on an allied champion and heals them for 150 + 15% of their missing health. (180 second cooldown)"+ "<html>");
		jbtMorellonomicon.setToolTipText("<html>" +  "2200g" + "<br>"+ "Morellonomicon" + "<br>" + "+75 Ability Power" + "<br>" + "+12 Mana Regeneration per 5 seconds" + "<br>" + "+20% Cooldown Reduction" + "<br>" +
						"Unique: Dealing magic damage to an enemy champion below 40% health inflicts Grievous Wounds to them for 4 seconds." + "<html>");
		jbtMuramana.setToolTipText("<html>" +  "2100g" + "<br>"+ "Muramana" + "<br>" + "+1000 Mana" + "<br>" + "+20 Attack Damage" + "<br>" + "+7 Mana Regeneration per 5 seconds" + "<br>" + "Unique Passive - Awe: Gain attack damage equal to 2% of your maximum mana." +
						"<br>" + "Toggle: Dealing damage with single target, non-periodic spells or your basic attacks will consume 3% of your current mana to deal 6% of your current mana as magic damage." + "<html>");
		jbtNashorsTooth.setToolTipText("<html>" +  "2500g" + "<br>"+ "Nashor's Tooth" + "<br>" + "+65 Ability Power" + "<br>" + "+50% Attack Speed" + "<br>" + "+10 Mana Regeneration per 5 seconds" + "<br>" + "Unique: +20% cooldown reduction" + "<html>");
		jbtNeedlesslyLargeRod.setToolTipText("<html>" +  "1600g" + "<br>"+ "Needlessly Large Rod" + "<br>" + "+80 Ability Power" + "<html>");
		jbtNegatronCloak.setToolTipText("<html>" +  "810g" + "<br>"+ "Negatron Cloak" + "<br>" + "+45 Magic Resistance" + "<html>");
		jbtNinjaTabi.setToolTipText("<html>" +  "1000g" + "<br>"+ "Ninja Tabi" + "<br>" + "+25 Armor" + "<br>" + "Unique – Enhanced Movement: +45 movement speed." + "<br>" + "Unique: Blocks 10% of the damage from basic attacks." + "<html>");
		jbtNullMagicMantle.setToolTipText("<html>" +  "400g" + "<br>"+ "Null-Magic Mantle" + "<br>" + "+20 Magic Resistance" + "<html>");
		jbtOhmwrecker.setToolTipText("<html>" +  "2850g" + "<br>"+ "Ohmwrecker" + "<br>" + "+350 Health" + "<br>" + "+300 Mana" + "<br>" + "+55 Armor" + "<br>" + "Unique Active: Prevents the closest enemy tower from attacking for 2.5 seconds (120 second cooldown). This effect cannot be used against the same tower more than once every 7.5 seconds." + "<html>");
		jbtOraclesElixir.setToolTipText("<html>" +  "400g" + "<br>"+ "Oracle's Elixer" + "<br>" + "Grants your champion stealth detection for 5 minutes or until they die." + "<html>");
		jbtPhage.setToolTipText("<html>" + "1465g" +  "<br>" + "Phage" + "<br>" + "+200 Health"+ "<br>" + "+20 Attack Damage" + "<br>" + "Unique - Icy: Your basic attacks have a 25% chance to slow your" +
				"target's movement speed by 30% for 2 seconds (20% slow for ranged attacks)." + "<html>");
		jbtPhantomDancer.setToolTipText("<html>" +  "2800g" + "<br>"+ "Phantom Dancer" + "<br>" + "+50% Attack Speed"+ "<br>" + "+30% Critical Strike Chance"  + "<br>" + "+5% Movement Speed" + "<br>" 
				+ "Unique: Your champion ignores unti collision." + "<html>");
		jbtPhilsophersStone.setToolTipText("<html>" +  "700g" + "<br>"+ "Philsopher's Stone" + "<br>" + "+7 Health Regeneration per 5 seconds"+ "<br>" + "+9 Mana Regeneration per 5 seconds"  + "<br>"  
				+ "Unique – Transmute: Gain +5 additional gold every 10 seconds.");
		jbtPickaxe.setToolTipText("<html>" +  "875g" + "<br>"+ "Pickaxe" + "<br>" + "+25 Attack Damage" + "<html>");
		jbtQuicksilverSash.setToolTipText("<html>" +  "1660g" + "<br>"+ "Quicksilver Sash" + "<br>" + "+45 Magic Resist" + "<br>" + "Unique - Quicksilver: Removes all debuffs from your champion. 90 second cooldown." + "<html>");
		jbtRabadonsDeathcap.setToolTipText("<html>" +  "3200g" + "<br>"+ "Rabadon's Deathcap" + "<br>" + "+120 Ability Power"+ "<br>" + "Unique: +25% Ability Power" + "<html>");
		jbtRanduinsOmen.setToolTipText("<html>" +  "3100g" + "<br>"+ "Randuin's Omen" + "<br>" + "+500 Health"+ "<br>" + "+70 Armor" + "<br>" + "Unique Passive – Cold Steel: If you are hit by a basic attack, you slow the attacker's " +
				"attack speed by 20% and their movement speed by 10% for 1.5 seconds." + "<br>" + "Unique Active: Slows the movement speed of nearby enemy units by 35% for 2 seconds + 1 second for every 100 armor and magic resistance you have. 60 second cooldown." + "<html>");
		jbtRavenousHydra.setToolTipText("<html>" +  "3500g" + "<br>"+ "Ravenous Hydra" + "<br>" + "+75 Attack Damage"+ "<br>" + "+15 Health Regen per 5" + "<br>" + "+10% Life Steal"+ "<br>" + "Unique - Cleave (Melee Only): Your attacks deal physical " +
				"damage up to 60% of your Attack Damage to units around your target, decaying to 20% near the edge." + "<br>" + "Unique - Crescent (Melee Only): Your attacks deal physical damage" +
				" up to 100% of your Attack Damage to units around your target, decaying to 60% near the edge. (10 second cooldown)" + "<html>");
		jbtRecurveBow.setToolTipText("<html>" +  "950g" + "<br>"+ "Recurve Bow" + "<br>" + "+30% Attack Speed" + "<html>");
		jbtRejuvenationBead.setToolTipText("<html>" +  "180g"  + "<br>"+ "Rejuvenation Bead" + "<br>" + "+5 Health Regeneration per 5 seconds" + "<html>");
		jbtRodOfAges.setToolTipText("<html>" +  "2800g" + "<br>"+ "Rod of Ages" + "<br>" + "+450 Health" + "<br>" + "+450 Mana" + "<br>" + "+60 Ability Power" + "<br>" + "Passive: This item gains 20 health, 20 mana and 2 ability power every minute, up to 10 times."
				+ "<br>" + "Unique Passive – Valor's Reward: On leveling up, restores 150 health and 200 mana over 8 seconds." + "<html>");
		jbtRubyCrystal.setToolTipText("<html>" +  "475g" + "<br>"+ "Ruby Crystal" + "<br>" + "+180 Health" + "<html>");
		jbtRubySightstone.setToolTipText("<html>" +  "1300g" + "<br>"+ "Ruby Sightstone" + "<br>" + "+300 Health" + "<br>" + "Unique Passive: Ward Refresh - Starts with 5 charges and refills each time you visit the shop." 
				+ "<br>" + "Unique Active: Ghost Ward - Consumes a charge to place an invisible Ghost Ward that reveals the surrounding area for 3 minutes. You may have a maximum of 3 wards placed from this item at once. 1 second cooldown." + "<html>");
		jbtRunaansHurricane.setToolTipText("<html>" +  "2750g" + "<br>"+ "Runaan's Hurricane" + "<br>" + "+70% Attack Speed"+ "<br>" + "Unique (Ranged only): Your basic attacks fire minor bolts at 2 nearby targets, each dealing 10 + 50% " +
				"of your attack damage and applying on-hit effects." + "<html>");
		jbtRunicBulwark.setToolTipText("<html>" +  "3200g" + "<br>"+ "Runic Bulwark" + "<br>" + "+400 Health"+ "<br>" + "+20 Armor" +  
				"<br>" + "+30 Magic Resistance" + "<br>" + "Unique - Legion: Nearby allies gain +10 Armor, +30 Magic Resist, and +10 Health regen per 5 seconds." + "<html>");
		jbtRylaisCrystalScepter.setToolTipText("<html>" + "2900g" + "<br>" + "Rylai's Crystal Scepterl" + "<br>" + "+80 Ability Power" + "<br>" + "+500 Health" + "<br>" + "Unique: Your spell damage will slow the target by 35% for 1.5 seconds (15% for multi-target spells, damage-over-time spells and spells with a cooldown time below 3 seconds)." + "<html>");
		jbtSapphireCrystal.setToolTipText("<html>" +  "400g" + "<br>"+ "Sapphire Crystal" + "<br>" + "+200 Mana" + "<html>");
		jbtSeraphsEmbrace.setToolTipText("<html>" +  "2710g" + "<br>"+ "Seraph's Embrace" + "<br>" + "+1000 Mana"+ "<br>" + "+60 Ability Power" + "<br>" + "+10 Mana Regeneration per 5" + "<br>" + "Unique Passive - Insight: Gain ability power equal to 3% of your maximum mana." 
				+ "<br>" + "Unique Active - Mana Shield: Drains 25% of your current mana to shield yourself for an equal amount for 3 seconds (120 second cooldown)." + "<html>");
		jbtShardOfTrueIce.setToolTipText("<html>" +  "1700g" + "<br>"+ "Shard of True Ice" + "<br>" + "+45 Ability Power"+ "<br>" + "Unique Aura: Mana Warp - Nearby allied champions gain 6 mana regen per 5 seconds." +
				"<br>" + "Unique Passive: Lucky Shadow - Gain an additional 4 gold every 10 seconds." + "<br>" + "Unique Active: Surrounds an ally with a blizzard for 4 seconds that slows nearby enemy movement speed by 30%. 60 second cooldown." + "<html>");
		jbtSheen.setToolTipText("<html>" +  "1260g" + "<br>"+ "Sheen" + "<br>" + "+25 Ability Power"+ "<br>" + "+200 Mana" + "<br>" + "Unique Passive - SpellBlade: On cast, your next standard attack deals additional physical " +
				"damage equal to 100% of your base attack damage. (2 second cooldown)." + "<html>");
		jbtShurelyasReverie.setToolTipText("<html>" +  "2100g" + "<br>"+ "Shurelya's Reverie" + "<br>" + "+250 Health"+ "<br>" + "+10 Health Regeneration per 5 seconds" + "<br>" + "+10 Mana Regeneration" + "<br>" 
				+ "Unique: +10% cooldown reduction" + "<br>" + "Unique: Nearby champions gain 40% movement speed for 3 seconds (60 second cooldown)." + "<html>");
		jbtSightward.setToolTipText("<html>" +  "75g" + "<br>"+ "Sight Ward" + "<br>" + "Places an invisible ward with 1100 range. Lasts 3 minutes." + "<html>");
		jbtSightstone.setToolTipText("<html>" +  "700g" + "<br>"+ "Sightstone" + "<br>" + "+100 Health" + "<br>" + "Unique - Ward Refresh: Starts with 4 charges and refill each time you return to the shop." + "<br>" + "Unique - Ghost Ward: Consumes a charge to play a Ghost Ward. you may have a maximum of 2 wards from this item at once."+  "<html>");
		jbtSorcerersShoes.setToolTipText("<html>" +  "1100g" + "<br>"+ "Sorcerer's Shoes" + "<br>" + "+15 Magic Penetration" + "<br>" + "Unique – Enhanced Movement: +45 movement speed." + "<html>");
		jbtSpiritOfTheAncientGolem.setToolTipText("<html>" +  "2400g" + "<br>"+ "Spirit of the Ancient Golem" + "<br>" + "+500 Health" + "<br>" + "+30 Armor" + "<br>" + "+14 Health Regeneration per 5 seconds" + "<br>" + "+7 Mana Regeneration per 5 seconds"
		+ "<br>" + "Unique Passive - Butcher: Damage dealt to neutral monsters increased by 25%." + "<br>" + "Unique Passive - Tenacity: The duration of stuns, slows, taunts, fears, silences, blinds and immobilizes are reduced by 35%." + "<html>");
		jbtSpiritOfTheElderLizard.setToolTipText("<html>" +  "2400g" + "<br>"+ "Spirit of the Elder Lizard" + "<br>" + "+50 Attack Damage" + "<br>" + "+10% Cooldown Reduction" + "<br>" + "+14 Health Regeneration per 5 seconds" + "<br>" + "+7 Mana Regeneration per 5 seconds"
		+ "<br>" + "Unique Passive - Butcher: Damage dealt to neutral monsters increased by 25%." + "<br>" + "Unique Passive - Incinerate: Basic attacks and damaging abilities (excluding damage over time) burn the target for 15-66 (based on level) true damage over 3 seconds." + "<html>");
		jbtSpiritOfTheSpectralWraith.setToolTipText("<html>" +  "2400g" + "<br>"+ "Spirit of the Spectral Wraith" + "<br>" + "+50 Ability Power" + "<br>" + "+30 Armor" + "<br>" + "+10 Mana Regneration per 5 seconds" + "<br>" + "+10 Cooldown Reduction"
				+ "<br>" + "Unique Passive: +20% spell vamp" + "<br>" + "Unique Passive - Butcher: Damage dealt to neutral monsters increased by 25%." + "<html>");
		jbtSpiritStone.setToolTipText("<html>" +  "800g" + "<br>"+ "Spirit Stone" + "<br>" + "+50 Attack Damage" + "<br>" + "+14 Health Regeneration per 5 seconds" + "<br>" + "+7 Mana Regeneration per 5 seconds"
				+ "<br>" + "Unique Passive - Butcher: Damage dealt to neutral monsters increased by 20%." + "<br>" + "Unique Passive - Rend: Your basic attacks against monsters deal bonus 10 true damage." + "<html>");
		jbtSpiritVisage.setToolTipText("<html>" +  "2200g" + "<br>"+ "Sprit Visage" + "<br>" + "+200 Health"+ "<br>" + "+50 Magic Resistance" + "<br>" + "+15% Cooldown Reduction" + "<br>" 
				+ "Unique: Increases your healing, regeneration and drain effects on yourself by 20%." + "<html>");
		jbtStatikkShiv.setToolTipText("<html>" +  "2500g" + "<br>"+ "Statikk Shiv" + "<br>" + "+40 Attack Speed"+ "<br>" + "+20% Critical Strike Chance" + "<br>" + "+6% Movement Speed" + "<br>" +
				"Unique Passive: Move and attack builds Static Charges, at 100 charages, your next attack expends the charges to deal 100 magic" +
				" damage to up to 4 targets. This damage can critically strike" + "<html>");
		jbtStinger.setToolTipText("<html>" +  "1250g" + "<br>"+ "Stinger" + "<br>" + "+40% Attack Speed"+ "<br>" + "Unique: +10% Cooldown Reduction" + "<html>");
		jbtSunfireCape.setToolTipText("<html>" +  "2500g" + "<br>"+ "Sunfire Cape" + "<br>" + "+45 Armor"+ "<br>" + "+450 Health" + "<br>" + "Unique: Deals 40 magic damage per second to nearby enemies." + "<html>");
		jbtSwordOfTheDivine.setToolTipText("<html>" +  "2200g" + "<br>"+ "Sword of the Divine" + "<br>" + "+45% Attack Speed"+ "<br>" + "Passive: This item does not grant any attack speed while on cooldown. Champion kills reduce the current cooldown by 50%" +
				"<br>" + "Active: You gain 100% attack speed and 100% critical strike for 3 seconds or 3 critical strikes - 60 second cooldown." + "<html>");
		jbtSwordOfTheOccult.setToolTipText("<html>" +  "1200g" + "<br>"+ "Sword of the Occult" + "<br>" + "+10 Attack Damage"+ "<br>" + "Unique: Your champion gains +5 damage per stack, receiving 2 stacks for a kill or 1 stack for an assist. This effect can stack 20 times; " +
				"you lose a third of your stacks if you die. At 20 stacks, your champion gains +15% movement speed." + "<html>");
		jbtTearOfTheGoddess.setToolTipText("<html>" +  "700g" + "<br>"+ "Tear of the Goddess" + "<br>" + "+250 Mana"+ "<br>" + "+7 Mana Regeneration per 5 seconds" + "<br>" + "Unique – Mana Charge: Each time you cast a spell or spend mana, your maximum mana increases by 4 (3 second cooldown). Bonus caps at +750 bonus mana." + "<html>");
		jbtTheBlackCleaver.setToolTipText("<html>" +  "3000g" + "<br>"+ "The Black Cleaver" + "<br>" + "+250 Health"+ "<br>" + "+50 Attack Damage" + "<br>" + "+10% Cooldown Reduction" + "<br>" + "Unique: +10 Armor Penetration"
				+ "<br>" + "Dealing physical damage to an enemy champion reduces their armor by 6.25% for 4 seconds. This effect stacks up to 4 times." + "<html>");
		jbtTheBloodthirster.setToolTipText("<html>" +  "3000g" + "<br>"+ "The Bloodthirster" + "<br>" + "+70 Damage"+ "<br>" + "+12% Life Steal" + "<br>" + "Passive: Gains 1 stack per kill up to a maximum of 30. Each stack " +
				"grants +1 attack damage and 0.2% Life Steal. (max: +30 Attack Damage and +6% Life Steal). Half of the current stacks are lost upon death." + "<html>");
		jbtTheBrutilizer.setToolTipText("<html>" +  "1337g" + "<br>"+ "The Brutalizer" + "<br>" + "+25 Attack Damage"+ "<br>" + "Unique: +10% Cooldown Reduction" + "<br>" + "Unique: +10 Armor Penetration" + "<html>");
		jbtTheHexCore.setToolTipText("<html>" +  "0g" + "<br>"+ "The Hex Core" + "<br>" + "+3 Ability Power per Level" + "<html>");
		jbtThornmail.setToolTipText("<html>" +  "2200g" + "<br>"+ "Thornmail" + "<br>" + "+100 Armor"+ "<br>" + "Unique: On being hit by basic attacks, returns 30% of damage, before any reductions such as armor, as magic damage. At least 15 damage must be received." + "<html>");
		jbtTiamat.setToolTipText("<html>" +  "2300g" + "<br>"+ "Tiamat" + "<br>" + "+50 Attack Damage"+ "<br>" + "+15 Health Regen per 5" + "<br>"+ "Unique - Cleave (Melee Only): Your attacks deal physical damage up to 60% of " +
				"your Attack Damage to units around your target, decaying to 20% near the edge." +  "<br>" + "Unique - Crescent (Melee Only): Your attacks deal physical damage" +
						" up to 100% of your Attack Damage to units around your target, decaying to 60% near the edge. (10 second cooldown)" + "<html>");
		jbtTrinityForce.setToolTipText("<html>" +  "4200g" + "<br>"+ "Trinity Force" + "<br>" + "+30 Ability Power"+ "<br>" + "+30 Attack Damage" + "<br>" + "+30% Attack Speed" + "<br>" + "+10% Critical Stike Chance" + "<br>" +
				"+250 Health" + "<br>" + "+200 Mana" + "<br>" + "+8% Movement Speed" + "<br>" + "Unique Passive - Icy: Your basic attacks have a 25% chance to slow your target's movement" +
						"speed by 30% for 2 seconds (20% for ranged attacks)" + "<br>" + "Unique Passive - SpellBlade: After using an ability, your next basic attack deals bonus damage equal" +
								"to 150% of your base attack damage as physical damage. (2 second cooldown)." + "<html>");
		jbtTwinShadows.setToolTipText("<html>" +  "1900g" + "<br>"+ "Twin Shadows" + "<br>" + "+40 Ability Power" + "<br>" + "+40 Magic Resistance" + "<br>" + "+6% Movement Speed" + "<br>"
								+ "Unique Active: Hunt - Summons 2 invulnerable ghosts for 6 seconds to seek the two nearest enemy champions. If they touch an enemy champion, they slow their movement speed by 40% and reveal them for 2.5 seconds. 120 second cooldown." + "<html>");
		jbtVampiricScepter.setToolTipText("<html>" +  "800g" + "<br>"+ "Vampiric Scepter" + "<br>" + "+10 Attack Damage" + "<br>" + "+10% Life Steal" + "<html>");
		jbtVisionWard.setToolTipText("<html>" +  "125g" + "<br>"+ "Vision Ward" + "<br>" + "Places an invisible ward with 1000 range Magical Sight (can see invisible units). Lasts 3 minutes." + "<html>");
		jbtVoidStaff.setToolTipText("<html>" +  "2295g" + "<br>"+ "Void Staff" + "<br>" + "+70 Ability Power" + "<br>" + "+Unique: +35% magic penetration" + "<html>");
		jbtWardensMail.setToolTipText("<html>" +  "1100g" + "<br>"+ "Warden's Mail" + "<br>" + "+50 Armor" + "<br>" + "Unique – Cold Steel: If you are hit by a basic attack, you slow the attacker's attack speed by 20% for 2 seconds." + "<html>");
		jbtWarmogsArmor.setToolTipText("<html>" +  "2650g" + "<br>"+ "Warmog's Armor" + "<br>" + "+1000 Health" + "<br>" + "Unique Passive: You gain health regeneration equal to 1.5% of your maximum health." + "<html>");
		jbtWillOfTheAncients.setToolTipText("<html>" +  "2550g" + "<br>"+ "Will of the Ancients" + "<br>" + "+50 Ability Power" + "<br>" + "Unique: Nearby allied champions gain +30 ability power and +20% spell vamp. " + "<html>");
		jbtWitsEnd.setToolTipText("<html>" + "2200g" + "<br>"+ "Wit's End" + "<br>" + "+40% Attack Speed" + "<br>" + "+20 Magic Resistance" + "<br>" + "Unique: Your basic attacks deal 42 bonus magic damage. " 
				+ "<br>" + "Unique: Your basic attacks increase your magic resistance by 5 for 5 seconds (maximum 4 stacks)." + "<html>");
		jbtWrigglesLantern.setToolTipText("<html>" +  "1600g" + "<br>"+ "Wriggle's Lantern" + "<br>" + "+30 Armor" + "<br>" + "+15 Attack Damage" + "<br>" + "+10% Life Steal" + "<br>" + "Unique Passive - Maim: Your basic attacks against minions " +
				"and monsters have a 25% chance to deal 500 additional magic damage." + "<br>" + "Places a Sight Ward at target location. 3 minute cooldown. " + "<html>");
		jbtYoumuusGhostBlade.setToolTipText("<html>" +  "2700g" + "<br>"+ "Youmuu's Ghostblade" + "<br>" + "+30 Attack Damage"+ "<br>" + "+15% Critical Strike Chance" + 
				"<br>" + "+10% Cooldown Reduction" + "<br>" + "Unique: +20 armor penetration" + "<br>" + "Unique: Gain +40% attack speed and +20% movement speed for 6 seconds (4 seconds for ranged champions) - 45 second cooldown." + "<html>");
		jbtZeal.setToolTipText("<html>" +  "1175g" + "<br>"+ "Zeal" + "<br>" + "+18% Attack Speed"+ "<br>" + "+10% Critical Strike Chance" + 
				"<br>" + "+5% Movement Speed" + "<html>");
		jbtZekesHerald.setToolTipText("<html>" +  "2450g" + "<br>"+ "Zeke's Herald" + "<br>" + "+250 Health"+ "<br>" + "+15% Cooldown Reduction" + 
				"<br>" + "Unique: Nearby allied champions gain +20 attack damage and +10% life steal. " + "<html>");
		jbtZephyr.setToolTipText("<html>" + "2850g" + "<br>" + "Zephyr" + "<br>" + "+20 Attack Damage"+ "<br>" + "+50% Attack Speed" + "<br>" + "+10% Movement Speed" + "<br>" + "+10% Cooldown Reduction" + "<br>" + "Unique Passive - Tenacity: The duration of stuns, slows, taunts, fears, silences, blinds and immobilizes are reduced by 35%." + "<html>");
		jbtZhonyasHourglass.setToolTipText("<html>" +  "3100g" + "<br>"+ "Zhonya's Hourglass" + "<br>" + "+100 Ability Power"+ "<br>" + "+50 Armor" + "<br>" + "Unique: Places your champion into stasis for 2.5 seconds," +
				" rendering you invulnerable and untargetable but unable to take any actions. 90 second cooldown." + "<html>");
	}
	
	////////////////////////////
	////Getters for Buttons/////
	////////////////////////////
	
	/**
	 * Getter for the back button.
	 * @return
	 */
	public JButton getBackButton(){
		return back;
	}
	
	/**
	 * Getter for the first item button.
	 * @return item1
	 */
	public JButton getItem1(){
		return item1;
	}
	
	/**
	 * Getter for the second item button.
	 * @return item2
	 */
	public JButton getItem2(){
		return item2;
	}
	
	/**
	 * Getter for the third item button.
	 * @return item3
	 */
	public JButton getItem3(){
		return item3;
	}
	
	/**
	 * Getter for the fourth item button.
	 * @return item4
	 */
	public JButton getItem4(){
		return item4;
	}
	
	/**
	 * Getter for the fifth item button.
	 * @return item5
	 */
	public JButton getItem5(){
		return item5;
	}
	
	/**
	 * Getter for the sixth item button.
	 * @return item6
	 */
	public JButton getItem6(){
		return item6;
	}
	
	/**
	 * Getter for the Level Spinner.
	 * @return spinner
	 */
	public JSpinner getSpinner(){
		return spinner;
	}
	
	/////////////////////////////////////////////
	/////Methods to calculate champion stats/////
	/////////////////////////////////////////////
	
	
	/**
	 * Calculates and displays a champions statistics.
	 */
	public void setChampStats(){
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		
		jlbName.setText("Name: " + model.getSelectedChampion().getName());
		jlbHealth.setText("Health: " + this.calculateHP());
		jlbArmor.setText("Armor: " + nf.format(this.calculateArmor()));
		jlbMagicResist.setText("Magic Resist: " + nf.format(this.calculateMrst()));
		jlbHealthRegen.setText("Health Regen: " + nf.format(this.calculateHealthRegen())); 
		jlbTenacity.setText("Tenacity: " + this.calculateTenacity());
		jlbDamage.setText("Attack Damage: " + nf.format(this.calculateDamage()));
		jlbCriticalStrike.setText("Critical Strike: " + nf.format(this.calculateCrit()) + "%");
		nf.setMaximumFractionDigits(3);
		jlbAttackSpeed.setText("Attack Speed: " + nf.format(this.calculateAttackSpeed()));
		nf.setMaximumFractionDigits(2); 
		jlbLifeSteal.setText("Life Steal: " + nf.format(this.calculateLifeSteal()) + "%");
		jlbAbilityPower.setText("Ability Power: " + nf.format(this.calculateAbilityPower()));
		jlbCooldownReduction.setText("Cooldown: " + this.calculateCDR() + "%");
		jlbSpellVamp.setText("Spell Vamp: " + this.calculateSpellVamp() + "%");
		jlbMana.setText("Mana: " + nf.format(this.calculateMana()));
		jlbManaRegen.setText("Mana Regen: " + nf.format(this.calculateManaRegen()));
		jlbMoveSpeed.setText("Movespeed: " + this.calculateMovespeed());
		jlbArp.setText("Armor Pen: " + this.calculateArp());
		jlbMpen.setText("Magic Pen: " + this.calculateMpen());
		jlbLevel.setText("Level");
		
	}
		
	/**
	 * Calculates a champions attack speed.
	 * @return attackspeed
	 */
	public double calculateAttackSpeed(){
		double attackspeed = model.getSelectedChampion().getAttackspeed();
		int level = model.getSelectedChampion().getLevel();
		double scale =  attackspeed * (model.getSelectedChampion().getAttackspeedscale() / 100 );
		double items = 0;
		
		for(int i = 0; i < model.getSelectedChampion().getItems().size(); i++){			 
			items = items + model.getSelectedChampion().getItems().get(i).getAttackspeed();
		}
		
		if(items > 0){
			items = (items / 100);
		}
		
		if(level == 1 && items > 0){
			attackspeed = attackspeed + (attackspeed * items);
		}
		
		if(level > 1){
			attackspeed = attackspeed + ( scale * ( level - 1) + (attackspeed * items) );
		}	
	
		return attackspeed;
	}
	
	/**
	 * Calculates a champions Health points.
	 * @return hp
	 */
	public int calculateHP(){

		int hp = (model.getSelectedChampion().getHp() + (model.getSelectedChampion().getHpScale() * model.getSelectedChampion().getLevel()));
		for(int i = 0; i < model.getSelectedChampion().getItems().size(); i++ ){
			
			if( model.getSelectedChampion().getItems().get(i).getHp() > 0){
				hp += model.getSelectedChampion().getItems().get(i).getHp(); 
			}
		}
		
		return hp;
		
	}
	
	/**
	 * Calculates a champions armor.
	 * @return armor
	 */
	public double calculateArmor(){
		
		double armor = model.getSelectedChampion().getArm() + (model.getSelectedChampion().getArmorscale() * model.getSelectedChampion().getLevel());
		
		for(int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if (model.getSelectedChampion().getItems().get(i).getArm() > 0){
				armor = armor + model.getSelectedChampion().getItems().get(i).getArm();
			}				
		}		
		
		return armor;
		
	}
	
	/**
	 * Calculates a champions Magic Resist.
	 * @return mrst
	 */
	public double calculateMrst(){
		
		double mrst = model.getSelectedChampion().getMrst() + (model.getSelectedChampion().getMrstscale() * model.getSelectedChampion().getLevel());
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if (model.getSelectedChampion().getItems().get(i).getMrst() > 0){
				mrst = mrst + model.getSelectedChampion().getItems().get(i).getMrst();
			}
		}
		
		return mrst;
		
	}
	
	/**
	 * Calculates a champions Health Regen.
	 * @return hpregen
	 */
	public double calculateHealthRegen(){
		
		double regen = model.getSelectedChampion().getHpregen() + (model.getSelectedChampion().getHpregenscale() * model.getSelectedChampion().getLevel());
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if (model.getSelectedChampion().getItems().get(i).getHpregen() > 0){
				regen = regen + model.getSelectedChampion().getItems().get(i).getHpregen();
			}
		}
		
		return regen;
		
	}
	
	/**
	 * Calculates a champions attack damage.
	 * @return ad
	 */
	public double calculateDamage(){
	
		double ad = model.getSelectedChampion().getAd() + (model.getSelectedChampion().getAdscale() * model.getSelectedChampion().getLevel());
		boolean manamune = false;
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if (model.getSelectedChampion().getItems().get(i).getAd() > 0){
				ad = ad + model.getSelectedChampion().getItems().get(i).getAd();
				if(model.getSelectedChampion().getItems().get(i).getName() == "Manamune" || model.getSelectedChampion().getItems().get(i).getName() == "Muramana"){
					manamune = true;
				}
			}
		}
		
		if(manamune == true){
				ad = ad + ((this.calculateMana() / 100) * 2);
		}
		
		return ad;

		
	}
	
	/**
	 * Calculates a champions crit percentage.
	 * @return crit
	 */
	public int calculateCrit(){
		
		int crit = model.getSelectedChampion().getCrit();
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if(model.getSelectedChampion().getItems().get(i).getCrit() > 0)
				crit = crit + model.getSelectedChampion().getItems().get(i).getCrit();
		}
		
		if(crit > 99)
			crit = 100;
		
		return crit;
	}
	
	/**
	 * Calculates a champions life steal.
	 * @return lifesteal
	 */
	public int calculateLifeSteal(){
		
		int lifesteal = model.getSelectedChampion().getLifeSteal();
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if(model.getSelectedChampion().getItems().get(i).getLifeSteal() > 0)
				lifesteal = lifesteal + model.getSelectedChampion().getItems().get(i).getLifeSteal();
		}
		
		return lifesteal;
	}
	
	/**
	 * Calculates a champions ability power.
	 * @return ap
	 */
	public double calculateAbilityPower(){
		
		double ap = model.getSelectedChampion().getAp();		
		int rabCounter = 0;
		int archangelsCounter = 0;
		int wotaCounter = 0;
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if(model.getSelectedChampion().getItems().get(i).getAp() > 0){
				ap = ap + model.getSelectedChampion().getItems().get(i).getAp();
				if(model.getSelectedChampion().getItems().get(i).getName() == "RabadonsDeathcap"){
					rabCounter++;
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "ArchangelsStaff" || model.getSelectedChampion().getItems().get(i).getName() == "SeraphsEmbrace"){
					archangelsCounter++;
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "WillOfTheAncients"){
					wotaCounter++;
					if(wotaCounter > 1)
						ap = ap - 30;
				}
			}
		}
		
		if(archangelsCounter > 0){
			ap =  ap + ((this.calculateMana() / 100) * 3);
		}
		
		if(rabCounter > 0){			
			ap = ap + (ap * .3);
		}		
		
		return ap;
		
	}
	
	/**
	 * Calculates a champions Cooldown Reduction.
	 * @return cdr
	 */
	public int calculateCDR(){
		
		int cdr = model.getSelectedChampion().getCDR();
		int athenes = 0;
		int codex = 0;
		int shroud = 0;
		int ionian = 0;
		int kindlegem = 0;
		int nashors = 0;
		int stinger = 0;
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if(model.getSelectedChampion().getItems().get(i).getCDR() > 0)
				cdr = cdr + model.getSelectedChampion().getItems().get(i).getCDR();
			
				if(model.getSelectedChampion().getItems().get(i).getName() == "AthenesUnholyGrail"){
					athenes++;
					if(athenes > 1)
						cdr = cdr - model.getSelectedChampion().getItems().get(i).getCDR();
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "FiendishCodex"){
					codex++;
					if(codex > 1)
						cdr = cdr - model.getSelectedChampion().getItems().get(i).getCDR();
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "GlacialShroud"){
					shroud++;
					if(shroud > 1)
						cdr = cdr - model.getSelectedChampion().getItems().get(i).getCDR();
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "IonianBootsOfLucidity"){
					ionian++;
					if(ionian > 1)
						cdr = cdr - model.getSelectedChampion().getItems().get(i).getCDR();
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "Kindlegem"){
					kindlegem++;
					if(kindlegem > 1)
						cdr = cdr - model.getSelectedChampion().getItems().get(i).getCDR();
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "NashorsTooth"){
					nashors++;
					if(nashors > 1)
						cdr = cdr - model.getSelectedChampion().getItems().get(i).getCDR();
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "Stinger"){
					stinger++;
					if(stinger > 1)
						cdr = cdr - model.getSelectedChampion().getItems().get(i).getCDR();
				}
				
		}
		
		
		if (cdr > 40){
			cdr = 40;			
		}
		
		return cdr;
		
	}
	
	/**
	 * Calculates a champions spell vamp.
	 * @return spellvamp
	 */
	public int calculateSpellVamp(){		
		int spellVamp = model.getSelectedChampion().getSpellVamp();
		int wotaCounter = 0;
		int revolverCounter = 0;
		int gunbladeCounter = 0;
		int wraithCounter = 0;
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if(model.getSelectedChampion().getItems().get(i).getSpellVamp() > 0)
				spellVamp = spellVamp + model.getSelectedChampion().getItems().get(i).getSpellVamp();
			
				if(model.getSelectedChampion().getItems().get(i).getName() == "WillOfTheAncients"){
					wotaCounter++;
					if(wotaCounter > 1)
						spellVamp = spellVamp - model.getSelectedChampion().getItems().get(i).getSpellVamp();	
				}
			
				else if(model.getSelectedChampion().getItems().get(i).getName() == "HextechRevolver"){
					revolverCounter++;
					if(revolverCounter > 1)
						spellVamp = spellVamp - model.getSelectedChampion().getItems().get(i).getSpellVamp();
					
				}
			
				else if(model.getSelectedChampion().getItems().get(i).getName() == "HextechGunblade"){
					gunbladeCounter++;
					if(gunbladeCounter > 1)
						spellVamp = spellVamp - model.getSelectedChampion().getItems().get(i).getSpellVamp();
				}
			
				else if(model.getSelectedChampion().getItems().get(i).getName() == "SpiritOfTheSpectralWraith"){
					wraithCounter++;
					if(wraithCounter > 1)
						spellVamp = spellVamp - model.getSelectedChampion().getItems().get(i).getSpellVamp();
				}			
		}
		
		return spellVamp;
		
	}

	/**
	 * Calculates a champions mana.
	 * @return mana
	 */
	public double calculateMana(){
		
		double mana = model.getSelectedChampion().getMana() + (model.getSelectedChampion().getManascale() * model.getSelectedChampion().getLevel());
		
		for(int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if (model.getSelectedChampion().getItems().get(i).getMana() > 0){
				mana = mana + model.getSelectedChampion().getItems().get(i).getMana();
			}				
		}		
		
		return mana;
		
	}
	
	/**
	 * Calculates a champions mana regen.
	 * @return manaregen
	 */
	public double calculateManaRegen(){
		double regen = model.getSelectedChampion().getManaregen() + (model.getSelectedChampion().getManaregenscale() * model.getSelectedChampion().getLevel());
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if (model.getSelectedChampion().getItems().get(i).getManaregen() > 0){
				regen = regen + model.getSelectedChampion().getItems().get(i).getManaregen();
			}
		}
		
		return regen;
	}
	
	/**
	 * Calculates a champions movespeed.
	 * @return movespeed
	 */
	public int calculateMovespeed(){
		
		int movespeed = model.getSelectedChampion().getMovespeed();
		double percent = 0;
			
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if(model.getSelectedChampion().getItems().get(i).getName() == "LichBane" || model.getSelectedChampion().getItems().get(i).getName() == "Zeal" || 
					model.getSelectedChampion().getItems().get(i).getName() == "PhantomDancer" )
				percent = percent + 5;
			
			if(model.getSelectedChampion().getItems().get(i).getName() == "StattikShiv" || model.getSelectedChampion().getItems().get(i).getName() == "TwinShadows")
				percent = percent + 6;
			
			if(model.getSelectedChampion().getItems().get(i).getName() == "TrinityForce")
				percent = percent + 8;
			
			if(model.getSelectedChampion().getItems().get(i).getName() == "Zephyr")
				percent = percent + 10;
		}
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if(model.getSelectedChampion().getItems().get(i).getMovespeed() > 0){
				if(model.getSelectedChampion().getItems().get(i).getName() == "BootsOfMobility"){
					movespeed = movespeed + model.getSelectedChampion().getItems().get(i).getMovespeed();
					break;
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "BootsOfSwiftness"){
					movespeed = movespeed + model.getSelectedChampion().getItems().get(i).getMovespeed();
					break;
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "SorcerersShoes"){
					movespeed = movespeed + model.getSelectedChampion().getItems().get(i).getMovespeed();
					break;
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "BerserkersGreaves"){
					movespeed = movespeed + model.getSelectedChampion().getItems().get(i).getMovespeed();
					break;
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "IonianBootsOfLucidty"){
					movespeed = movespeed + model.getSelectedChampion().getItems().get(i).getMovespeed();
					break;
				}				
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "MercurysTreads"){
					movespeed = movespeed + model.getSelectedChampion().getItems().get(i).getMovespeed();
					break;
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "NinjaTabi"){
					movespeed = movespeed + model.getSelectedChampion().getItems().get(i).getMovespeed();
					break;
				}
				
				if(model.getSelectedChampion().getItems().get(i).getName() == "BootsOfSpeed"){
					movespeed = movespeed + model.getSelectedChampion().getItems().get(i).getMovespeed();
					break;
				}				
			}
		}
		
		movespeed = (int) (movespeed + (movespeed * (percent / 100)));
		
		return movespeed;
		
		
	}
	
	/**
	 * Calculates a champions armor penetration.
	 * @return arp
	 */
	public double calculateArp(){
		
		double arp = model.getSelectedChampion().getArp();
		int bcCounter = 0;
		int brutCounter = 0;
		int yoomuuCounter = 0;
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if (model.getSelectedChampion().getItems().get(i).getArp() > 0){
				arp = arp + model.getSelectedChampion().getItems().get(i).getArp();
				if(model.getSelectedChampion().getItems().get(i).getName() == "TheBlackCleaver"){
					bcCounter++;
					if(bcCounter > 1)
						arp = arp - model.getSelectedChampion().getItems().get(i).getArp();
				}
			
				if(model.getSelectedChampion().getItems().get(i).getName() == "TheBrutilizer"){
					brutCounter++;
					if(brutCounter > 1)
						arp = arp - model.getSelectedChampion().getItems().get(i).getArp();
				}
			
				if(model.getSelectedChampion().getItems().get(i).getName() == "YoomuusGhostBlade"){
					yoomuuCounter++;
					if(yoomuuCounter > 1)
						arp = arp - model.getSelectedChampion().getItems().get(i).getArp();
				}
			}
		}
		
		return arp;
		
	}
	
	/**
	 * Calculates a champions magic penetration
	 * @return mpen
	 */
	public double calculateMpen(){
	
		double mpen = model.getSelectedChampion().getMpen();
		int guiseCounter = 0;
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if (model.getSelectedChampion().getItems().get(i).getMpen() > 0){
				mpen = mpen + model.getSelectedChampion().getItems().get(i).getMpen();
				if(model.getSelectedChampion().getItems().get(i).getName() == "HauntingGuise" || model.getSelectedChampion().getItems().get(i).getName() == "LiandrysTorment"){
					guiseCounter++;
				}
			}
		}
		
		if(guiseCounter > 0){
			for(int i = 1; i < guiseCounter; guiseCounter--){
				mpen = mpen - model.getItemList().get(46).getMpen();
			}
		}
		
		return mpen;	
		
	}
	
	/**
	 * Calculates a champions tenacity.
	 * @return tenacity
	 */
	public int calculateTenacity(){
		
		int tenacity = model.getSelectedChampion().getTenacity();
		
		for (int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			if (model.getSelectedChampion().getItems().get(i).getTenacity() > 0){
				tenacity = tenacity + model.getSelectedChampion().getItems().get(i).getTenacity();
			}
		}
		
		if(tenacity > 34){
			tenacity = 35;
		}
		
		return tenacity;
	}
	
	///////////////////////
	///Utility Methods/////
	///////////////////////
	
	/**
	 * Swaps the image from the button clicked to the inventory button.
	 * @param jbt
	 */
	public void updateInventory(JButton jbt){
		
		int iconspot = -1;
		
		for(int i = 0; i < model.getSelectedChampion().getItems().size(); i++){
			iconspot = i;
		}
		
		switch (iconspot)
		{
		case 0:
			item1.setIcon(jbt.getIcon());
			break;
		case 1:
			item2.setIcon(jbt.getIcon());
			break;
		case 2:
			item3.setIcon(jbt.getIcon());
			break;
		case 3:
			item4.setIcon(jbt.getIcon());
			break;
		case 4:
			item5.setIcon(jbt.getIcon());
			break;
		case 5:
			item6.setIcon(jbt.getIcon());
			break;	
		}
		
	}
	
	/**
	 * Determines which button was clicked and replaces its image with the default empty inventory image.
	 * @param jbt
	 */
	public void removeInventoryItem(JButton jbt){
		
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("images/inventoryslot.png"));
		
		if(model.getSelectedChampion().getItems().size() == 0){
			
		}
		
		else if (jbt == item1){
			
			if(model.getSelectedChampion().getItems().size() == 1){
				model.getSelectedChampion().getItems().remove(0);
				item1.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 2){
				model.getSelectedChampion().getItems().remove(0);
				item1.setIcon(item2.getIcon());
				item2.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 3){
				model.getSelectedChampion().getItems().remove(0);
				item1.setIcon(item2.getIcon());
				item2.setIcon(item3.getIcon());
				item3.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 4){
				model.getSelectedChampion().getItems().remove(0);
				item1.setIcon(item2.getIcon());
				item2.setIcon(item3.getIcon());
				item3.setIcon(item4.getIcon());
				item4.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 5){
				model.getSelectedChampion().getItems().remove(0);
				item1.setIcon(item2.getIcon());
				item2.setIcon(item3.getIcon());
				item3.setIcon(item4.getIcon());
				item4.setIcon(item5.getIcon());
				item5.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 6){
				model.getSelectedChampion().getItems().remove(0);
				item1.setIcon(item2.getIcon());
				item2.setIcon(item3.getIcon());
				item3.setIcon(item4.getIcon());
				item4.setIcon(item5.getIcon());
				item5.setIcon(item6.getIcon());
				item6.setIcon(icon);
			}
		}
		
		else if (jbt == item2){
			
			if(model.getSelectedChampion().getItems().size() == 2){
				model.getSelectedChampion().getItems().remove(1);
				item2.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 3){
				model.getSelectedChampion().getItems().remove(1);
				item2.setIcon(item3.getIcon());
				item3.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 4){
				model.getSelectedChampion().getItems().remove(1);
				item2.setIcon(item3.getIcon());
				item3.setIcon(item4.getIcon());
				item4.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 5){
				model.getSelectedChampion().getItems().remove(1);
				item2.setIcon(item3.getIcon());
				item3.setIcon(item4.getIcon());
				item4.setIcon(item5.getIcon());
				item5.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 6){
				model.getSelectedChampion().getItems().remove(1);
				item2.setIcon(item3.getIcon());
				item3.setIcon(item4.getIcon());
				item4.setIcon(item5.getIcon());
				item5.setIcon(item6.getIcon());
				item6.setIcon(icon);
			}
			
		}
		
		else if (jbt == item3){
			
			if(model.getSelectedChampion().getItems().size() == 3){
				model.getSelectedChampion().getItems().remove(2);
				item3.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 4){
				model.getSelectedChampion().getItems().remove(2);
				item3.setIcon(item4.getIcon());
				item4.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 5){
				model.getSelectedChampion().getItems().remove(2);
				item3.setIcon(item4.getIcon());
				item4.setIcon(item5.getIcon());
				item5.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 6){
				model.getSelectedChampion().getItems().remove(2);
				item3.setIcon(item4.getIcon());
				item4.setIcon(item5.getIcon());
				item5.setIcon(item6.getIcon());
				item6.setIcon(icon);
			}
			
		}
		
		else if (jbt == item4){
			
			if(model.getSelectedChampion().getItems().size() == 4){
				model.getSelectedChampion().getItems().remove(3);
				item4.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 5){
				model.getSelectedChampion().getItems().remove(3);
				item4.setIcon(item5.getIcon());
				item5.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 6){
				model.getSelectedChampion().getItems().remove(3);
				item4.setIcon(item5.getIcon());
				item5.setIcon(item6.getIcon());
				item6.setIcon(icon);
			}
		}
		
		else if (jbt == item5){
			
			
			if(model.getSelectedChampion().getItems().size() == 5){
				model.getSelectedChampion().getItems().remove(4);
				item5.setIcon(icon);
			}
			
			else if(model.getSelectedChampion().getItems().size() == 6){
				model.getSelectedChampion().getItems().remove(4);
				item5.setIcon(item6.getIcon());
				item6.setIcon(icon);
			}
			
		}
		
		else if (jbt == item6){
			
			if(model.getSelectedChampion().getItems().size() == 6){
				model.getSelectedChampion().getItems().remove(5);
				item6.setIcon(icon);
			}
			
		}
		
	}
	
	/**
	 * Clears all of the items and sets the images to default empty images. For use when the back button is clicked.
	 */
	public void clearItems(){
		
		while(model.getSelectedChampion().getItems().size() > 0){
			model.getSelectedChampion().getItems().remove(0);
		}
		
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("images/inventoryslot.png"));
		item1.setIcon(icon);
		item2.setIcon(icon);
		item3.setIcon(icon);
		item4.setIcon(icon);
		item5.setIcon(icon);
		item6.setIcon(icon);
	}
	
	///////////////////////
	///Getters for Items///
	///////////////////////
	
	public JButton getAbyssalScepter() {
		return jbtAbyssalScepter;
	}

	public JButton getAegisOfTheLegion() {
		return jbtAegisOfTheLegion;
	}

	public JButton getAmplifyingTome() {
		return jbtAmplifyingTome;
	}

	public JButton getArchangelsStaff() {
		return jbtArchangelsStaff;
	}

	public JButton getAthenesUnholyGrail() {
		return jbtAthenesUnholyGrail;
	}

	public JButton getAtmasImpaler() {
		return jbtAtmasImpaler;
	}

	public JButton getAugmentDeath() {
		return jbtAugmentDeath;
	}

	public JButton getAugmentGravity() {
		return jbtAugmentGravity;
	}

	public JButton getAugmentPower() {
		return jbtAugmentPower;
	}

	public JButton getAvariceBlade() {
		return jbtAvariceBlade;
	}

	public JButton getBFSword() {
		return jbtBFSword;
	}

	public JButton getBannerOfCommand() {
		return jbtBannerOfCommand;
	}

	public JButton getBansheesVeil() {
		return jbtBansheesVeil;
	}

	public JButton getBerserkersGreaves() {
		return jbtBerserkersGreaves;
	}

	public JButton getBilgewaterCutlass() {
		return jbtBilgewaterCutlass;
	}

	public JButton getBladeOfTheRuinedKing() {
		return jbtBladeOfTheRuinedKing;
	}

	public JButton getBlastingWand() {
		return jbtBlastingWand;
	}

	public JButton getBonetoothNecklace() {
		return jbtBonetoothNecklace;
	}

	public JButton getBootsOfMobility() {
		return jbtBootsOfMobility;
	}

	public JButton getBootsOfSpeed() {
		return jbtBootsOfSpeed;
	}

	public JButton getBootsOfSwiftness() {
		return jbtBootsOfSwiftness;
	}

	public JButton getBrawlersGloves() {
		return jbtBrawlersGloves;
	}

	public JButton getCatalystTheProtector() {
		return jbtCatalystTheProtector;
	}

	public JButton getChainVest() {
		return jbtChainVest;
	}

	public JButton getChaliceOfHarmony() {
		return jbtChaliceOfHarmony;
	}

	public JButton getCloakOfAgility() {
		return jbtCloakOfAgility;
	}

	public JButton getClothArmor() {
		return jbtClothArmor;
	}

	public JButton getCrystalineFlask() {
		return jbtCrystalineFlask;
	}

	public JButton getDagger() {
		return jbtDagger;
	}

	public JButton getDeathfireGrasp() {
		return jbtDeathfireGrasp;
	}

	public JButton getDoransBlade() {
		return jbtDoransBlade;
	}

	public JButton getDoransRing() {
		return jbtDoransRing;
	}

	public JButton getDoransShield() {
		return jbtDoransShield;
	}

	public JButton getEleisasMiracle() {
		return jbtEleisasMiracle;
	}

	public JButton getElixirOfBrilliance() {
		return jbtElixirOfBrilliance;
	}

	public JButton getElixirOfFortitude() {
		return jbtElixirOfFortitude;
	}

	public JButton getEmblemOfValor() {
		return jbtEmblemOfValor;
	}

	public JButton getExecutionersCalling() {
		return jbtExecutionersCalling;
	}

	public JButton getFaerieCharm() {
		return jbtFaerieCharm;
	}

	public JButton getFiendishCodex() {
		return jbtFiendishCodex;
	}

	public JButton getFrozenHeart() {
		return jbtFrozenHeart;
	}

	public JButton getFrozenMallet() {
		return jbtFrozenMallet;
	}

	public JButton getGiantsBelt() {
		return jbtGiantsBelt;
	}

	public JButton getGlacialShroud() {
		return jbtGlacialShroud;
	}

	public JButton getGuardianAngel() {
		return jbtGuardianAngel;
	}

	public JButton getGuinsoosRageblade() {
		return jbtGuinsoosRageblade;
	}

	public JButton getHauntingGuise() {
		return jbtHauntingGuise;
	}

	public JButton getHealthPotion() {
		return jbtHealthPotion;
	}

	public JButton getHexdrinker() {
		return jbtHexdrinker;
	}

	public JButton getHextechGunblade() {
		return jbtHextechGunblade;
	}

	public JButton getHextechRevolver() {
		return jbtHextechRevolver;
	}

	public JButton getHuntersMachete() {
		return jbtHuntersMachete;
	}

	public JButton getIcebornGauntlet() {
		return jbtIcebornGauntlet;
	}

	public JButton getInfinityEdge() {
		return jbtInfinityEdge;
	}

	public JButton getIonianBootsOfLucidity() {
		return jbtIonianBootsOfLucidity;
	}

	public JButton getKagesLuckyPick() {
		return jbtKagesLuckyPick;
	}

	public JButton getKindlegem() {
		return jbtKindlegem;
	}

	public JButton getLastWhisper() {
		return jbtLastWhisper;
	}

	public JButton getLiandrysTorment() {
		return jbtLiandrysTorment;
	}

	public JButton getLichBane() {
		return jbtLichBane;
	}

	public JButton getLocketOfTheIronSolari() {
		return jbtLocketOfTheIronSolari;
	}

	public JButton getLongSword() {
		return jbtLongSword;
	}

	public JButton getMadredsRazor() {
		return jbtMadredsRazor;
	}

	public JButton getMalady() {
		return jbtMalady;
	}

	public JButton getManaManipulator() {
		return jbtManaManipulator;
	}

	public JButton getManaPotion() {
		return jbtManaPotion;
	}

	public JButton getManamune() {
		return jbtManamune;
	}

	public JButton getMawOfMalmortius() {
		return jbtMawOfMalmortius;
	}

	public JButton getMejaisSoulstealer() {
		return jbtMejaisSoulstealer;
	}

	public JButton getMercurialScimitar() {
		return jbtMercurialScimitar;
	}

	public JButton getMercurysTreads() {
		return jbtMercurysTreads;
	}

	public JButton getMikaelsCrucibal() {
		return jbtMikaelsCrucibal;
	}

	public JButton getMorellonomicon() {
		return jbtMorellonomicon;
	}

	public JButton getMuramana() {
		return jbtMuramana;
	}

	public JButton getNashorsTooth() {
		return jbtNashorsTooth;
	}

	public JButton getNeedlesslyLargeRod() {
		return jbtNeedlesslyLargeRod;
	}

	public JButton getNegatronCloak() {
		return jbtNegatronCloak;
	}

	public JButton getNinjaTabi() {
		return jbtNinjaTabi;
	}

	public JButton getNullMagicMantle() {
		return jbtNullMagicMantle;
	}

	public JButton getOhmwrecker() {
		return jbtOhmwrecker;
	}

	public JButton getOraclesElixir() {
		return jbtOraclesElixir;
	}

	public JButton getPhage() {
		return jbtPhage;
	}

	public JButton getPhantomDancer() {
		return jbtPhantomDancer;
	}

	public JButton getPhilsophersStone() {
		return jbtPhilsophersStone;
	}

	public JButton getPickaxe() {
		return jbtPickaxe;
	}

	public JButton getQuicksilverSash() {
		return jbtQuicksilverSash;
	}

	public JButton getRabadonsDeathcap() {
		return jbtRabadonsDeathcap;
	}

	public JButton getRanduinsOmen() {
		return jbtRanduinsOmen;
	}

	public JButton getRavenousHydra() {
		return jbtRavenousHydra;
	}

	public JButton getRecurveBow() {
		return jbtRecurveBow;
	}

	public JButton getRejuvenationBead() {
		return jbtRejuvenationBead;
	}

	public JButton getRodOfAges() {
		return jbtRodOfAges;
	}

	public JButton getRubyCrystal() {
		return jbtRubyCrystal;
	}

	public JButton getRubySightstone() {
		return jbtRubySightstone;
	}

	public JButton getRunaansHurricane() {
		return jbtRunaansHurricane;
	}

	public JButton getRunicBulwark() {
		return jbtRunicBulwark;
	}

	public JButton getRylaisCrystalScepter() {
		return jbtRylaisCrystalScepter;
	}

	public JButton getSapphireCrystal() {
		return jbtSapphireCrystal;
	}

	public JButton getSeraphsEmbrace() {
		return jbtSeraphsEmbrace;
	}

	public JButton getShardOfTrueIce() {
		return jbtShardOfTrueIce;
	}

	public JButton getSheen() {
		return jbtSheen;
	}

	public JButton getShurelyasReverie() {
		return jbtShurelyasReverie;
	}

	public JButton getSightward() {
		return jbtSightward;
	}

	public JButton getSightstone() {
		return jbtSightstone;
	}

	public JButton getSorcerersShoes() {
		return jbtSorcerersShoes;
	}

	public JButton getSpiritOfTheAncientGolem() {
		return jbtSpiritOfTheAncientGolem;
	}

	public JButton getSpiritOfTheElderLizard() {
		return jbtSpiritOfTheElderLizard;
	}

	public JButton getSpiritOfTheSpectralWraith() {
		return jbtSpiritOfTheSpectralWraith;
	}

	public JButton getSpiritStone() {
		return jbtSpiritStone;
	}

	public JButton getSpiritVisage() {
		return jbtSpiritVisage;
	}

	public JButton getStatikkShiv() {
		return jbtStatikkShiv;
	}

	public JButton getStinger() {
		return jbtStinger;
	}

	public JButton getSunfireCape() {
		return jbtSunfireCape;
	}

	public JButton getSwordOfTheDivine() {
		return jbtSwordOfTheDivine;
	}

	public JButton getSwordOfTheOccult() {
		return jbtSwordOfTheOccult;
	}

	public JButton getTearOfTheGoddess() {
		return jbtTearOfTheGoddess;
	}

	public JButton getTheBlackCleaver() {
		return jbtTheBlackCleaver;
	}

	public JButton getTheBloodthirster() {
		return jbtTheBloodthirster;
	}

	public JButton getTheBrutilizer() {
		return jbtTheBrutilizer;
	}

	public JButton getTheHexCore() {
		return jbtTheHexCore;
	}

	public JButton getThornmail() {
		return jbtThornmail;
	}

	public JButton getTiamat() {
		return jbtTiamat;
	}

	public JButton getTrinityForce() {
		return jbtTrinityForce;
	}

	public JButton getTwinShadows() {
		return jbtTwinShadows;
	}

	public JButton getVampiricScepter() {
		return jbtVampiricScepter;
	}

	public JButton getVisionWard() {
		return jbtVisionWard;
	}

	public JButton getVoidStaff() {
		return jbtVoidStaff;
	}

	public JButton getWardensMail() {
		return jbtWardensMail;
	}

	public JButton getWarmogsArmor() {
		return jbtWarmogsArmor;
	}

	public JButton getWillOfTheAncients() {
		return jbtWillOfTheAncients;
	}

	public JButton getWitsEnd() {
		return jbtWitsEnd;
	}

	public JButton getWrigglesLantern() {
		return jbtWrigglesLantern;
	}

	public JButton getYoumuusGhostBlade() {
		return jbtYoumuusGhostBlade;
	}

	public JButton getZeal() {
		return jbtZeal;
	}

	public JButton getZekesHerald() {
		return jbtZekesHerald;
	}

	public JButton getZephyr() {
		return jbtZephyr;
	}

	public JButton getZhonyasHourglass() {
		return jbtZhonyasHourglass;
	}


	public void actionPerformed(ActionEvent arg0) {
		
	}

}
