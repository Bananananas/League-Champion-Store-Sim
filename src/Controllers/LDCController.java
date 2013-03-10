package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import Model.LDCModel;
import Views.LDCChampionView;
import Views.LDCView;


public class LDCController {

	/** The model the Controller will be retrieving data from. */
	private LDCModel model;
	
	/** The view the Controller with be receiving inputs from. */
	private LDCView view;
	
	/** The view the Controller will be receiving inputs from */
	private LDCChampionView champView;
	
	/** no arg constructor */
	public LDCController(){
		//intentionally empty
	}
	
	//////////////////////////////////////
	////////Main View Listeners///////////
	//////////////////////////////////////
	
	/** Listens to all the champions buttons and determines which one the user selected. */	
	private class buttonListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == view.getAhri()){
				model.setSelectedChampion(0);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getAkali()){
				model.setSelectedChampion(1);
				champView.setChampStats();
				switchView();
				
			}
			
			else if(e.getSource() == view.getAlistar()){
				model.setSelectedChampion(2);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getAmumu()){
				model.setSelectedChampion(3);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getAnivia()){
				model.setSelectedChampion(4);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getAnnie()){
				model.setSelectedChampion(5);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getAshe()){
				model.setSelectedChampion(6);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getBlitzcrank()){
				model.setSelectedChampion(7);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getBrand()){
				model.setSelectedChampion(8);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getCaitlyn()){
				model.setSelectedChampion(9);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getCassiopeia()){
				model.setSelectedChampion(10);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getChogath()){
		
				model.setSelectedChampion(11);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getCorki()){
			
				model.setSelectedChampion(12);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getDarius()){
			
				model.setSelectedChampion(13);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getDiana()){
				
				model.setSelectedChampion(14);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getDrmundo()){
			
				model.setSelectedChampion(15);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getDraven()){
				model.setSelectedChampion(16);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getElise()){
	
				model.setSelectedChampion(17);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getEvelynn()){
		
				model.setSelectedChampion(18);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getEzreal()){

				model.setSelectedChampion(19);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getFiddlesticks()){
	
				model.setSelectedChampion(20);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getFiora()){
		
				model.setSelectedChampion(21);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getFizz()){
		
				model.setSelectedChampion(22);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getGalio()){
			
				model.setSelectedChampion(23);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getGangplank()){
			
				model.setSelectedChampion(24);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getGaren()){
		
				model.setSelectedChampion(25);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getGragas()){
		
				model.setSelectedChampion(26);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getGraves()){

				model.setSelectedChampion(27);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getHecarim()){
		
				model.setSelectedChampion(28);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getHeimerdinger()){
		
				model.setSelectedChampion(29);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getIrelia()){
				
				model.setSelectedChampion(30);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getJanna()){
			
				model.setSelectedChampion(31);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getJarvenIV()){
				
				model.setSelectedChampion(32);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getJax()){
				
				model.setSelectedChampion(33);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getJayce()){
				
				model.setSelectedChampion(34);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getKarma()){
		
				model.setSelectedChampion(35);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getKarthus()){
			
				model.setSelectedChampion(36);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getKassadin()){
	
				model.setSelectedChampion(37);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getKatarina()){
				
				model.setSelectedChampion(38);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getKayle()){
		
				model.setSelectedChampion(39);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getKennen()){
				
				model.setSelectedChampion(40);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getKhazix()){
		
				model.setSelectedChampion(41);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getKogmaw()){
	
				model.setSelectedChampion(42);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getLeblanc()){
				
				model.setSelectedChampion(43);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getLeesin()){
			
				model.setSelectedChampion(44);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getLeona()){
			
				model.setSelectedChampion(45);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getLulu()){
			
				model.setSelectedChampion(46);
				switchView();
			}
			
			else if(e.getSource() == view.getLux()){
				model.setSelectedChampion(47);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getMalphite()){
				model.setSelectedChampion(48);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getMalzahar()){
				model.setSelectedChampion(49);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getMaokai()){
				model.setSelectedChampion(50);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getMasteryi()){
				model.setSelectedChampion(51);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getMissfortune()){
				model.setSelectedChampion(52);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getMordekaiser()){
				model.setSelectedChampion(53);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getMorgana()){
				model.setSelectedChampion(54);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getNami()){
				model.setSelectedChampion(55);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getNasus()){
				model.setSelectedChampion(56);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getNautilus()){
				model.setSelectedChampion(57);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getNidalee()){
				model.setSelectedChampion(58);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getNocturne()){
				model.setSelectedChampion(59);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getNunu()){
				model.setSelectedChampion(60);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getOlaf()){
				model.setSelectedChampion(61);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getOrianna()){
				model.setSelectedChampion(62);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getPantheon()){
				model.setSelectedChampion(63);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getPoppy()){
				model.setSelectedChampion(64);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getRammus()){
				model.setSelectedChampion(65);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getRenekton()){
				model.setSelectedChampion(66);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getRengar()){
				model.setSelectedChampion(67);
				champView.addRengarItems();
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getRiven()){
				model.setSelectedChampion(68);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getRumble()){
				model.setSelectedChampion(69);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getRyze()){
				model.setSelectedChampion(70);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getSejuani()){
				model.setSelectedChampion(71);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getShaco()){
				model.setSelectedChampion(72);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getShen()){
				model.setSelectedChampion(73);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getShyvana()){
				model.setSelectedChampion(74);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getSinged()){
				model.setSelectedChampion(75);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getSion()){
				model.setSelectedChampion(76);
				switchView();
			}
			
			else if(e.getSource() == view.getSivir()){
				model.setSelectedChampion(77);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getSkarner()){
				model.setSelectedChampion(78);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getSona()){
				model.setSelectedChampion(79);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getSoraka()){
				model.setSelectedChampion(80);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getSwain()){
				model.setSelectedChampion(81);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getSyndra()){
				model.setSelectedChampion(82);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getTalon()){
				model.setSelectedChampion(83);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getTaric()){
				model.setSelectedChampion(84);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getTeemo()){
				model.setSelectedChampion(85);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getThresh()){
				model.setSelectedChampion(86);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getTristana()){
				model.setSelectedChampion(87);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getTrundle()){
				model.setSelectedChampion(88);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getTryndamere()){
				model.setSelectedChampion(89);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getTwistedfate()){
				model.setSelectedChampion(90);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getTwitch()){
				model.setSelectedChampion(91);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getUdyr()){
				model.setSelectedChampion(92);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getUrgot()){
				model.setSelectedChampion(93);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getVarus()){
				model.setSelectedChampion(94);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getVayne()){
				model.setSelectedChampion(95);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getVeigar()){
				model.setSelectedChampion(96);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getVi()){
				model.setSelectedChampion(97);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getViktor()){
				model.setSelectedChampion(98);
				champView.addViktorItems();
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getVladimir()){
				model.setSelectedChampion(99);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getVolibear()){
				model.setSelectedChampion(100);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getWarwick()){
				model.setSelectedChampion(101);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getWukong()){
				model.setSelectedChampion(102);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getXerath()){
				model.setSelectedChampion(103);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getXinzhao()){
				model.setSelectedChampion(104);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getYorick()){
				model.setSelectedChampion(105);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getZed()){
				model.setSelectedChampion(106);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getZiggs()){
				model.setSelectedChampion(107);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getZilean()){
				model.setSelectedChampion(108);
				champView.setChampStats();
				switchView();
			}
			
			else if(e.getSource() == view.getZyra()){
				model.setSelectedChampion(109);
				champView.setChampStats();
				switchView();
			}	
			
		}
	}
	
	//////////////////////////////////////
	////////Champion View Listeners///////
	//////////////////////////////////////
	
	/**
	 *Listener for the items. Adds it to a champions items array. If full it outputs an error.
	 */
	private class addItemListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			
			if(e.getSource() == champView.getAbyssalScepter()){
		
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(0));
					champView.setChampStats();
					champView.updateInventory(champView.getAbyssalScepter());
				}
				
				else				
					inventoryFull();						
				

			}
			
			else if(e.getSource() == champView.getAegisOfTheLegion()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(1));	
					champView.setChampStats();
					champView.updateInventory(champView.getAegisOfTheLegion());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getAmplifyingTome()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(2));	
					champView.setChampStats();
					champView.updateInventory(champView.getAmplifyingTome());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getArchangelsStaff()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(3));
					champView.setChampStats();
					champView.updateInventory(champView.getArchangelsStaff());
				}
				
				else				
					inventoryFull();
	
			}
			
			else if(e.getSource() == champView.getAthenesUnholyGrail()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(4));
					champView.setChampStats();
					champView.updateInventory(champView.getAthenesUnholyGrail());
				}
				
				else				
					inventoryFull();
	
			}
			
			else if(e.getSource() == champView.getAtmasImpaler()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(5));
					champView.setChampStats();
					champView.updateInventory(champView.getAtmasImpaler());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getAugmentDeath()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(6));
					champView.setChampStats();
					champView.updateInventory(champView.getAugmentDeath());
				}
				
				else				
					inventoryFull();
				
			}
			
			else if(e.getSource() == champView.getAugmentGravity()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(7));
					champView.setChampStats();
					champView.updateInventory(champView.getAugmentGravity());
				}
				
				else				
					inventoryFull();
				
			}
			
			else if(e.getSource() == champView.getAugmentPower()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(8));
					champView.setChampStats();
					champView.updateInventory(champView.getAugmentPower());
				}
				
				else				
					inventoryFull();
				
			}
			
			else if(e.getSource() == champView.getAvariceBlade()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(9));	
					champView.setChampStats();
					champView.updateInventory(champView.getAvariceBlade());
				}
				
				else				
					inventoryFull();
				
			}
			
			else if(e.getSource() == champView.getBFSword()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(10));
					champView.setChampStats();
					champView.updateInventory(champView.getBFSword());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getBannerOfCommand()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(11));	
					champView.setChampStats();
					champView.updateInventory(champView.getBannerOfCommand());
				}
				
				else				
					inventoryFull();
				
			}
			
			else if(e.getSource() == champView.getBansheesVeil()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(12));	
					champView.setChampStats();
					champView.updateInventory(champView.getBansheesVeil());
				}
				
				else				
					inventoryFull();
				
			}
			
			else if(e.getSource() == champView.getBerserkersGreaves()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(13));	
					champView.setChampStats();
					champView.updateInventory(champView.getBerserkersGreaves());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getBilgewaterCutlass()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(14));	
					champView.setChampStats();
					champView.updateInventory(champView.getBilgewaterCutlass());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getBladeOfTheRuinedKing()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(15));
					champView.setChampStats();
					champView.updateInventory(champView.getBladeOfTheRuinedKing());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getBlastingWand()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(16));	
					champView.setChampStats();
					champView.updateInventory(champView.getBlastingWand());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getBonetoothNecklace()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(17));		
					champView.setChampStats();
					champView.updateInventory(champView.getBonetoothNecklace());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getBootsOfMobility()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(18));	
					champView.setChampStats();
					champView.updateInventory(champView.getBootsOfMobility());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getBootsOfSpeed()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(19));	
					champView.setChampStats();
					champView.updateInventory(champView.getBootsOfSpeed());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getBootsOfSwiftness()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(20));
					champView.setChampStats();
					champView.updateInventory(champView.getBootsOfSwiftness());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getBrawlersGloves()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(21));
					champView.setChampStats();
					champView.updateInventory(champView.getBrawlersGloves());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getCatalystTheProtector()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(22));
					champView.setChampStats();
					champView.updateInventory(champView.getCatalystTheProtector());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getChainVest()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(23));	
					champView.setChampStats();
					champView.updateInventory(champView.getChainVest());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getChaliceOfHarmony()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(24));	
					champView.setChampStats();
					champView.updateInventory(champView.getChaliceOfHarmony());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getCloakOfAgility()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(25));		
					champView.setChampStats();
					champView.updateInventory(champView.getCloakOfAgility());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getClothArmor()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(26));	
					champView.setChampStats();
					champView.updateInventory(champView.getClothArmor());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getCrystalineFlask()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(27));	
					champView.setChampStats();
					champView.updateInventory(champView.getCrystalineFlask());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getDagger()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(28));	
					champView.setChampStats();
					champView.updateInventory(champView.getDagger());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getDeathfireGrasp()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(29));	
					champView.setChampStats();
					champView.updateInventory(champView.getDeathfireGrasp());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getDoransBlade()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(30));	
					champView.setChampStats();
					champView.updateInventory(champView.getDoransBlade());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getDoransRing()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(31));	
					champView.setChampStats();
					champView.updateInventory(champView.getDoransRing());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getDoransShield()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(32));
					champView.setChampStats();
					champView.updateInventory(champView.getDoransShield());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getEleisasMiracle()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(33));
					champView.setChampStats();
					champView.updateInventory(champView.getEleisasMiracle());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getElixirOfBrilliance()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(34));
					champView.setChampStats();
					champView.updateInventory(champView.getElixirOfBrilliance());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getElixirOfFortitude()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(35));	
					champView.setChampStats();
					champView.updateInventory(champView.getElixirOfFortitude());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getEmblemOfValor()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(36));
					champView.setChampStats();
					champView.updateInventory(champView.getEmblemOfValor());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getExecutionersCalling()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(37));	
					champView.setChampStats();
					champView.updateInventory(champView.getExecutionersCalling());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getFaerieCharm()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(38));
					champView.setChampStats();
					champView.updateInventory(champView.getFaerieCharm());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getFiendishCodex()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(39));	
					champView.setChampStats();
					champView.updateInventory(champView.getFiendishCodex());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getFrozenHeart()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(40));	
					champView.setChampStats();
					champView.updateInventory(champView.getFrozenHeart());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getFrozenMallet()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(41));	
					champView.setChampStats();
					champView.updateInventory(champView.getFrozenMallet());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getGiantsBelt()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(42));	
					champView.setChampStats();
					champView.updateInventory(champView.getGiantsBelt());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getGlacialShroud()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(43));
					champView.setChampStats();
					champView.updateInventory(champView.getGlacialShroud());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getGuardianAngel()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(44));
					champView.setChampStats();
					champView.updateInventory(champView.getGuardianAngel());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getGuinsoosRageblade()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(45));
					champView.setChampStats();
					champView.updateInventory(champView.getGuinsoosRageblade());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getHauntingGuise()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(46));	
					champView.setChampStats();
					champView.updateInventory(champView.getHauntingGuise());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getHealthPotion()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(47));			
					champView.setChampStats();
					champView.updateInventory(champView.getHealthPotion());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getHexdrinker()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(48));	
					champView.setChampStats();
					champView.updateInventory(champView.getHexdrinker());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getHextechGunblade()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(49));
					champView.setChampStats();
					champView.updateInventory(champView.getHextechGunblade());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getHextechRevolver()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(50));	
					champView.setChampStats();
					champView.updateInventory(champView.getHextechRevolver());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getHuntersMachete()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(51));
					champView.setChampStats();
					champView.updateInventory(champView.getHuntersMachete());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getIcebornGauntlet()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(52));
					champView.setChampStats();
					champView.updateInventory(champView.getIcebornGauntlet());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getInfinityEdge()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(53));
					champView.setChampStats();
					champView.updateInventory(champView.getInfinityEdge());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getIonianBootsOfLucidity()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(54));
					champView.setChampStats();
					champView.updateInventory(champView.getIonianBootsOfLucidity());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getKagesLuckyPick()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(55));
					champView.setChampStats();
					champView.updateInventory(champView.getKagesLuckyPick());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getKindlegem()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(56));
					champView.setChampStats();
					champView.updateInventory(champView.getKindlegem());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getLastWhisper()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(57));			
					champView.setChampStats();
					champView.updateInventory(champView.getLastWhisper());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getLiandrysTorment()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(58));
					champView.setChampStats();
					champView.updateInventory(champView.getLiandrysTorment());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getLichBane()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(59));
					champView.setChampStats();
					champView.updateInventory(champView.getLichBane());
				}
				
				else				
					inventoryFull();
			}			
			
			else if(e.getSource() == champView.getLocketOfTheIronSolari()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(60));	
					champView.setChampStats();
					champView.updateInventory(champView.getLocketOfTheIronSolari());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getLongSword()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(61));
					champView.setChampStats();
					champView.updateInventory(champView.getLongSword());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getMadredsRazor()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(62));			
					champView.setChampStats();
					champView.updateInventory(champView.getMadredsRazor());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getMalady()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(63));
					champView.setChampStats();
					champView.updateInventory(champView.getMalady());					
				}
				
				else				
					inventoryFull();
			}			
			
			else if(e.getSource() == champView.getManaManipulator()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(64));
					champView.setChampStats();
					champView.updateInventory(champView.getManaManipulator());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getManaPotion()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(65));
					champView.setChampStats();
					champView.updateInventory(champView.getManaPotion());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getManamune()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(66));
					champView.setChampStats();
					champView.updateInventory(champView.getManamune());
				}
				
				else				
					inventoryFull();
			}			
			
			else if(e.getSource() == champView.getMawOfMalmortius()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(67));
					champView.setChampStats();
					champView.updateInventory(champView.getMawOfMalmortius());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getMejaisSoulstealer()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(68));
					champView.setChampStats();
					champView.updateInventory(champView.getMejaisSoulstealer());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getMercurialScimitar()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(69));
					champView.setChampStats();
					champView.updateInventory(champView.getMercurialScimitar());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getMercurysTreads()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(70));	
					champView.setChampStats();
					champView.updateInventory(champView.getMercurysTreads());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getMikaelsCrucibal()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(71));
					champView.setChampStats();
					champView.updateInventory(champView.getMikaelsCrucibal());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getMorellonomicon()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(72));
					champView.setChampStats();
					champView.updateInventory(champView.getMorellonomicon());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getMuramana()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(73));
					champView.setChampStats();
					champView.updateInventory(champView.getMuramana());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getNashorsTooth()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(74));	
					champView.setChampStats();
					champView.updateInventory(champView.getNashorsTooth());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getNeedlesslyLargeRod()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(75));
					champView.setChampStats();
					champView.updateInventory(champView.getNeedlesslyLargeRod());
				}
				
				else				
					inventoryFull();
			}			
			
			else if(e.getSource() == champView.getNegatronCloak()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(76));
					champView.setChampStats();
					champView.updateInventory(champView.getNegatronCloak());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getNinjaTabi()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(77));
					champView.setChampStats();
					champView.updateInventory(champView.getNinjaTabi());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getNullMagicMantle()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(78));
					champView.setChampStats();
					champView.updateInventory(champView.getNullMagicMantle());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getOhmwrecker()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(79));
					champView.setChampStats();
					champView.updateInventory(champView.getOhmwrecker());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getOraclesElixir()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(80));
					champView.setChampStats();
					champView.updateInventory(champView.getOraclesElixir());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getPhage()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(81));
					champView.setChampStats();
					champView.updateInventory(champView.getPhage());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getPhantomDancer()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(82));
					champView.setChampStats();
					champView.updateInventory(champView.getPhantomDancer());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getPhilsophersStone()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(83));
					champView.setChampStats();
					champView.updateInventory(champView.getPhilsophersStone());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getPickaxe()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(84));
					champView.setChampStats();
					champView.updateInventory(champView.getPickaxe());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getQuicksilverSash()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(85));
					champView.setChampStats();
					champView.updateInventory(champView.getQuicksilverSash());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRabadonsDeathcap()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(86));
					champView.setChampStats();
					champView.updateInventory(champView.getRabadonsDeathcap());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRanduinsOmen()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(87));
					champView.setChampStats();
					champView.updateInventory(champView.getRanduinsOmen());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRavenousHydra()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(88));
					champView.setChampStats();
					champView.updateInventory(champView.getRavenousHydra());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRecurveBow()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(89));	
					champView.setChampStats();
					champView.updateInventory(champView.getRecurveBow());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRejuvenationBead()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(90));
					champView.setChampStats();
					champView.updateInventory(champView.getRejuvenationBead());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRodOfAges()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(91));
					champView.setChampStats();
					champView.updateInventory(champView.getRodOfAges());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRubyCrystal()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(92));
					champView.setChampStats();
					champView.updateInventory(champView.getRubyCrystal());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRubySightstone()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(93));
					champView.setChampStats();
					champView.updateInventory(champView.getRubySightstone());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRunaansHurricane()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(94));
					champView.setChampStats();
					champView.updateInventory(champView.getRunaansHurricane());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRunicBulwark()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(95));
					champView.setChampStats();
					champView.updateInventory(champView.getRunicBulwark());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getRylaisCrystalScepter()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(96));
					champView.setChampStats();
					champView.updateInventory(champView.getRylaisCrystalScepter());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSapphireCrystal()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(97));
					champView.setChampStats();
					champView.updateInventory(champView.getSapphireCrystal());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSeraphsEmbrace()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(98));
					champView.setChampStats();
					champView.updateInventory(champView.getSeraphsEmbrace());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getShardOfTrueIce()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(99));
					champView.setChampStats();
					champView.updateInventory(champView.getShardOfTrueIce());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSheen()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(100));
					champView.setChampStats();
					champView.updateInventory(champView.getSheen());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getShurelyasReverie()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(101));
					champView.setChampStats();
					champView.updateInventory(champView.getShurelyasReverie());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSightward()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(102));
					champView.setChampStats();
					champView.updateInventory(champView.getSightward());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSightstone()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(103));
					champView.setChampStats();
					champView.updateInventory(champView.getSightstone());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSorcerersShoes()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(104));
					champView.setChampStats();
					champView.updateInventory(champView.getSorcerersShoes());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSpiritOfTheAncientGolem()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){	
					model.getSelectedChampion().addItem(model.getItemList().get(105));	
					champView.setChampStats();
					champView.updateInventory(champView.getSpiritOfTheAncientGolem());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSpiritOfTheElderLizard()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(106));
					champView.setChampStats();
					champView.updateInventory(champView.getSpiritOfTheElderLizard());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSpiritOfTheSpectralWraith()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(107));			
					champView.setChampStats();
					champView.updateInventory(champView.getSpiritOfTheSpectralWraith());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSpiritStone()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(108));
					champView.setChampStats();
					champView.updateInventory(champView.getSpiritStone());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSpiritVisage()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(109));
					champView.setChampStats();
					champView.updateInventory(champView.getSpiritVisage());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getStatikkShiv()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(110));	
					champView.setChampStats();
					champView.updateInventory(champView.getStatikkShiv());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getStinger()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(111));
					champView.setChampStats();
					champView.updateInventory(champView.getStinger());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSunfireCape()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(112));
					champView.setChampStats();
					champView.updateInventory(champView.getSunfireCape());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSwordOfTheDivine()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(113));
					champView.setChampStats();
					champView.updateInventory(champView.getSwordOfTheDivine());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getSwordOfTheOccult()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(114));	
					champView.setChampStats();
					champView.updateInventory(champView.getSwordOfTheOccult());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getTearOfTheGoddess()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(115));
					champView.setChampStats();
					champView.updateInventory(champView.getTearOfTheGoddess());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getTheBlackCleaver()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(116));	
					champView.setChampStats();
					champView.updateInventory(champView.getTheBlackCleaver());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getTheBloodthirster()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(117));
					champView.setChampStats();
					champView.updateInventory(champView.getTheBloodthirster());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getTheBrutilizer()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(118));
					champView.setChampStats();
					champView.updateInventory(champView.getTheBrutilizer());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getTheHexCore()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(119));
					champView.setChampStats();
					champView.updateInventory(champView.getTheHexCore());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getThornmail()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(120));
					champView.setChampStats();
					champView.updateInventory(champView.getThornmail());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getTiamat()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(121));	
					champView.setChampStats();
					champView.updateInventory(champView.getTiamat());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getTrinityForce()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(122));
					champView.setChampStats();
					champView.updateInventory(champView.getTrinityForce());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getTwinShadows()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(123));	
					champView.setChampStats();
					champView.updateInventory(champView.getTwinShadows());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getVampiricScepter()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(124));
					champView.setChampStats();
					champView.updateInventory(champView.getVampiricScepter());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getVisionWard()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(125));
					champView.setChampStats();
					champView.updateInventory(champView.getVisionWard());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getVoidStaff()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(126));
					champView.setChampStats();
					champView.updateInventory(champView.getVoidStaff());
				}
								
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getWardensMail()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(127));
					champView.setChampStats();
					champView.updateInventory(champView.getWardensMail());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getWarmogsArmor()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(128));
					champView.setChampStats();
					champView.updateInventory(champView.getWarmogsArmor());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getWillOfTheAncients()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(129));
					champView.setChampStats();
					champView.updateInventory(champView.getWillOfTheAncients());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getWitsEnd()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(130));
					champView.setChampStats();
					champView.updateInventory(champView.getWitsEnd());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getWrigglesLantern()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(131));	
					champView.setChampStats();
					champView.updateInventory(champView.getWrigglesLantern());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getYoumuusGhostBlade()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){			
					model.getSelectedChampion().addItem(model.getItemList().get(132));
					champView.setChampStats();
					champView.updateInventory(champView.getYoumuusGhostBlade());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getZeal()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(133));
					champView.setChampStats();
					champView.updateInventory(champView.getZeal());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getZekesHerald()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(134));
					champView.setChampStats();
					champView.updateInventory(champView.getZekesHerald());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getZephyr()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(135));
					champView.setChampStats();
					champView.updateInventory(champView.getZephyr());
				}
				
				else				
					inventoryFull();
			}
			
			else if(e.getSource() == champView.getZhonyasHourglass()){
				
				if (model.getSelectedChampion().getItems().size() <= 5){		
					model.getSelectedChampion().addItem(model.getItemList().get(136));
					champView.setChampStats();
					champView.updateInventory(champView.getZhonyasHourglass());
				}
				
				else				
					inventoryFull();
			}
			
		}		
	}

	/**
	 * Listener for the inventory buttons. Removes the item from the champions item list and updates the image.
	 */
	private class removeItemListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == champView.getItem1()){
				champView.removeInventoryItem(champView.getItem1());
				champView.setChampStats();
			}
			
			else if(e.getSource() == champView.getItem2()){
				champView.removeInventoryItem(champView.getItem2());
				champView.setChampStats();
			}
			
			else if(e.getSource() == champView.getItem3()){
				champView.removeInventoryItem(champView.getItem3());
				champView.setChampStats();
			}
			
			else if(e.getSource() == champView.getItem4()){
				champView.removeInventoryItem(champView.getItem4());
				champView.setChampStats();
			}
			
			else if(e.getSource() == champView.getItem5()){
				champView.removeInventoryItem(champView.getItem5());
				champView.setChampStats();
			}
			
			else if(e.getSource() == champView.getItem6()){
				champView.removeInventoryItem(champView.getItem6());
				champView.setChampStats();
			}			
		}		
	}
	
	/**
	 * Listener to the back button on the Champion View. Returns the user to champion select.
	 * @author Reggie
	 *
	 */
	private class backListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		
			if(model.getSelected() == 67){
				champView.removeRengarItems();
			}
			
			if(model.getSelected() == 98){
				champView.removeViktorItems();
			}
			
			champView.clearItems();
			champView.setVisible(false);
			view.setVisible(true);
			
		}		
	}
	
	/**
	 * Listener for the spinner on the Champion View. Updates the stats to reflect changes in a champions level.
	 */
	private class levelListener implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
				model.getSelectedChampion().setLevel((int) champView.getSpinner().getValue());	
				champView.setChampStats();
		}		
	}
	
	//////////////////////////////////////
	////////Setters and Utilities/////////
	//////////////////////////////////////
	
	/**
	 * Displays a JOptionPane to inform the user that their inventory is full.
	 */
	public void inventoryFull(){
		JOptionPane.showMessageDialog(null, "Inventory Full. Please delete an item by clicking it in your inventory.", "Inventory Full", JOptionPane.PLAIN_MESSAGE);
	}
	
	/**
	 * Disables the main view and activates the champion view.
	 */
	public void switchView(){
		
		view.setVisible(false);
		champView.setVisible(true);
	}
	
	/**
	 * Setter for the model.
	 */
	public void setModel(LDCModel model) {
		this.model = model;
		
	}
	
	/**
	 * Setter for the Champion View. 
	 */
	public void setChampView(LDCChampionView champView) {
		
		this.champView = champView;
		
	}
		
	/**
	 * Setter for the view, and sets up the action listeners	 
	 */
	public void setView(LDCView view) {
		
		this.view = view;
		addActionListener();
				
	}	
	
	/**
	 * Adds all of the ActionListeners
	 */
	public void addActionListener(){
		
		this.view.getAhri().addActionListener(new buttonListener());
		this.view.getAkali().addActionListener(new buttonListener());
		this.view.getAlistar().addActionListener(new buttonListener());
		this.view.getAmumu().addActionListener(new buttonListener());
		this.view.getAnivia().addActionListener(new buttonListener());
		this.view.getAnnie().addActionListener(new buttonListener());
		this.view.getAshe().addActionListener(new buttonListener());
		this.view.getBlitzcrank().addActionListener(new buttonListener());
		this.view.getBrand().addActionListener(new buttonListener());
		this.view.getCaitlyn().addActionListener(new buttonListener());
		this.view.getCassiopeia().addActionListener(new buttonListener());
		this.view.getChogath().addActionListener(new buttonListener());
		this.view.getCorki().addActionListener(new buttonListener());
		this.view.getDarius().addActionListener(new buttonListener());
		this.view.getDiana().addActionListener(new buttonListener());
		this.view.getDrmundo().addActionListener(new buttonListener());
		this.view.getDraven().addActionListener(new buttonListener());
		this.view.getEvelynn().addActionListener(new buttonListener());
		this.view.getElise().addActionListener(new buttonListener());
		this.view.getEzreal().addActionListener(new buttonListener());
		this.view.getFiddlesticks().addActionListener(new buttonListener());
		this.view.getFiora().addActionListener(new buttonListener());
		this.view.getFizz().addActionListener(new buttonListener());
		this.view.getGalio().addActionListener(new buttonListener());
		this.view.getGangplank().addActionListener(new buttonListener());
		this.view.getGaren().addActionListener(new buttonListener());
		this.view.getGragas().addActionListener(new buttonListener());
		this.view.getGraves().addActionListener(new buttonListener());
		this.view.getHecarim().addActionListener(new buttonListener());
		this.view.getHeimerdinger().addActionListener(new buttonListener());
		this.view.getIrelia().addActionListener(new buttonListener());
		this.view.getJanna().addActionListener(new buttonListener());
		this.view.getJarvenIV().addActionListener(new buttonListener());
		this.view.getJax().addActionListener(new buttonListener());
		this.view.getJayce().addActionListener(new buttonListener());
		this.view.getKarma().addActionListener(new buttonListener());
		this.view.getKarthus().addActionListener(new buttonListener());
		this.view.getKassadin().addActionListener(new buttonListener());
		this.view.getKatarina().addActionListener(new buttonListener());
		this.view.getKayle().addActionListener(new buttonListener());
		this.view.getKennen().addActionListener(new buttonListener());
		this.view.getKhazix().addActionListener(new buttonListener());
		this.view.getKogmaw().addActionListener(new buttonListener());
		this.view.getLeblanc().addActionListener(new buttonListener());
		this.view.getLeesin().addActionListener(new buttonListener());
		this.view.getLeona().addActionListener(new buttonListener());
		this.view.getLulu().addActionListener(new buttonListener());
		this.view.getLux().addActionListener(new buttonListener());
		this.view.getMalphite().addActionListener(new buttonListener());
		this.view.getMalzahar().addActionListener(new buttonListener());
		this.view.getMaokai().addActionListener(new buttonListener());
		this.view.getMasteryi().addActionListener(new buttonListener());
		this.view.getMissfortune().addActionListener(new buttonListener());
		this.view.getMordekaiser().addActionListener(new buttonListener());
		this.view.getMorgana().addActionListener(new buttonListener());
		this.view.getNami().addActionListener(new buttonListener());
		this.view.getNasus().addActionListener(new buttonListener());
		this.view.getNautilus().addActionListener(new buttonListener());
		this.view.getNidalee().addActionListener(new buttonListener());
		this.view.getNocturne().addActionListener(new buttonListener());
		this.view.getNunu().addActionListener(new buttonListener());
		this.view.getOlaf().addActionListener(new buttonListener());
		this.view.getOrianna().addActionListener(new buttonListener());
		this.view.getPantheon().addActionListener(new buttonListener());
		this.view.getPoppy().addActionListener(new buttonListener());
		this.view.getRammus().addActionListener(new buttonListener());
		this.view.getRenekton().addActionListener(new buttonListener());
		this.view.getRengar().addActionListener(new buttonListener());
		this.view.getRiven().addActionListener(new buttonListener());
		this.view.getRumble().addActionListener(new buttonListener());
		this.view.getRyze().addActionListener(new buttonListener());
		this.view.getSejuani().addActionListener(new buttonListener());
		this.view.getShaco().addActionListener(new buttonListener());
		this.view.getShen().addActionListener(new buttonListener());
		this.view.getShyvana().addActionListener(new buttonListener());
		this.view.getSinged().addActionListener(new buttonListener());
		this.view.getSion().addActionListener(new buttonListener());
		this.view.getSivir().addActionListener(new buttonListener());
		this.view.getSkarner().addActionListener(new buttonListener());
		this.view.getSona().addActionListener(new buttonListener());
		this.view.getSoraka().addActionListener(new buttonListener());
		this.view.getSwain().addActionListener(new buttonListener());
		this.view.getSyndra().addActionListener(new buttonListener());
		this.view.getTalon().addActionListener(new buttonListener());
		this.view.getTaric().addActionListener(new buttonListener());
		this.view.getTeemo().addActionListener(new buttonListener());
		this.view.getThresh().addActionListener(new buttonListener());
		this.view.getTristana().addActionListener(new buttonListener());
		this.view.getTrundle().addActionListener(new buttonListener());
		this.view.getTryndamere().addActionListener(new buttonListener());
		this.view.getTwistedfate().addActionListener(new buttonListener());
		this.view.getTwitch().addActionListener(new buttonListener());
		this.view.getUdyr().addActionListener(new buttonListener());
		this.view.getUrgot().addActionListener(new buttonListener());
		this.view.getVarus().addActionListener(new buttonListener());
		this.view.getVayne().addActionListener(new buttonListener());
		this.view.getVeigar().addActionListener(new buttonListener());
		this.view.getVi().addActionListener(new buttonListener());
		this.view.getViktor().addActionListener(new buttonListener());
		this.view.getVladimir().addActionListener(new buttonListener());
		this.view.getVolibear().addActionListener(new buttonListener());
		this.view.getWarwick().addActionListener(new buttonListener());
		this.view.getWukong().addActionListener(new buttonListener());
		this.view.getXerath().addActionListener(new buttonListener());
		this.view.getXinzhao().addActionListener(new buttonListener());
		this.view.getYorick().addActionListener(new buttonListener());
		this.view.getZed().addActionListener(new buttonListener());
		this.view.getZiggs().addActionListener(new buttonListener());
		this.view.getZilean().addActionListener(new buttonListener());
		this.view.getZyra().addActionListener(new buttonListener());
		
		this.champView.getSpinner().addChangeListener(new levelListener());
		this.champView.getBackButton().addActionListener(new backListener());
		this.champView.getItem1().addActionListener(new removeItemListener());
		this.champView.getItem2().addActionListener(new removeItemListener());
		this.champView.getItem3().addActionListener(new removeItemListener());
		this.champView.getItem4().addActionListener(new removeItemListener());
		this.champView.getItem5().addActionListener(new removeItemListener());
		this.champView.getItem6().addActionListener(new removeItemListener());
		this.champView.getAbyssalScepter().addActionListener(new addItemListener());
		this.champView.getAegisOfTheLegion().addActionListener(new addItemListener());		
		this.champView.getAmplifyingTome().addActionListener(new addItemListener());	
		this.champView.getArchangelsStaff().addActionListener(new addItemListener());	
		this.champView.getAthenesUnholyGrail().addActionListener(new addItemListener());		
		this.champView.getAtmasImpaler().addActionListener(new addItemListener());		
		this.champView.getAugmentDeath().addActionListener(new addItemListener());		
		this.champView.getAugmentGravity().addActionListener(new addItemListener());		
		this.champView.getAugmentPower().addActionListener(new addItemListener());		
		this.champView.getAvariceBlade().addActionListener(new addItemListener());
		this.champView.getBFSword().addActionListener(new addItemListener());
		this.champView.getBannerOfCommand().addActionListener(new addItemListener());		
		this.champView.getBansheesVeil().addActionListener(new addItemListener());		
		this.champView.getBerserkersGreaves().addActionListener(new addItemListener());		
		this.champView.getBilgewaterCutlass().addActionListener(new addItemListener());		
		this.champView.getBladeOfTheRuinedKing().addActionListener(new addItemListener());		
		this.champView.getBlastingWand().addActionListener(new addItemListener());		
		this.champView.getBonetoothNecklace().addActionListener(new addItemListener());		
		this.champView.getBootsOfMobility().addActionListener(new addItemListener());		
		this.champView.getBootsOfSpeed().addActionListener(new addItemListener());		
		this.champView.getBootsOfSwiftness().addActionListener(new addItemListener());		
		this.champView.getBrawlersGloves().addActionListener(new addItemListener());		
		this.champView.getCatalystTheProtector().addActionListener(new addItemListener());		
		this.champView.getChainVest().addActionListener(new addItemListener());		
		this.champView.getChaliceOfHarmony().addActionListener(new addItemListener());		
		this.champView.getCloakOfAgility().addActionListener(new addItemListener());		
		this.champView.getClothArmor().addActionListener(new addItemListener());		
		this.champView.getCrystalineFlask().addActionListener(new addItemListener());		
		this.champView.getDagger().addActionListener(new addItemListener());		
		this.champView.getDeathfireGrasp().addActionListener(new addItemListener());		
		this.champView.getDoransBlade().addActionListener(new addItemListener());		
		this.champView.getDoransRing().addActionListener(new addItemListener());		
		this.champView.getDoransShield().addActionListener(new addItemListener());		
		this.champView.getEleisasMiracle().addActionListener(new addItemListener());		
		this.champView.getElixirOfBrilliance().addActionListener(new addItemListener());	
		this.champView.getElixirOfFortitude().addActionListener(new addItemListener());		
		this.champView.getEmblemOfValor().addActionListener(new addItemListener());		
		this.champView.getExecutionersCalling().addActionListener(new addItemListener());		
		this.champView.getFaerieCharm().addActionListener(new addItemListener());		
		this.champView.getFiendishCodex().addActionListener(new addItemListener());		
		this.champView.getFrozenHeart().addActionListener(new addItemListener());	
		this.champView.getFrozenMallet().addActionListener(new addItemListener());	
		this.champView.getGiantsBelt().addActionListener(new addItemListener());		
		this.champView.getGlacialShroud().addActionListener(new addItemListener());		
		this.champView.getGuardianAngel ().addActionListener(new addItemListener());		
		this.champView.getGuinsoosRageblade().addActionListener(new addItemListener());		
		this.champView.getHauntingGuise().addActionListener(new addItemListener());		
		this.champView.getHealthPotion().addActionListener(new addItemListener());	
		this.champView.getHexdrinker().addActionListener(new addItemListener());		
		this.champView.getHextechGunblade().addActionListener(new addItemListener());		
		this.champView.getHextechRevolver().addActionListener(new addItemListener());		
		this.champView.getHuntersMachete().addActionListener(new addItemListener());		
		this.champView.getIcebornGauntlet().addActionListener(new addItemListener());		
		this.champView.getInfinityEdge().addActionListener(new addItemListener());		
		this.champView.getIonianBootsOfLucidity().addActionListener(new addItemListener());		
		this.champView.getKagesLuckyPick().addActionListener(new addItemListener());		
		this.champView.getKindlegem().addActionListener(new addItemListener());		
		this.champView.getLastWhisper().addActionListener(new addItemListener());		
		this.champView.getLiandrysTorment().addActionListener(new addItemListener());		
		this.champView.getLichBane().addActionListener(new addItemListener());		
		this.champView.getLocketOfTheIronSolari().addActionListener(new addItemListener());		
		this.champView.getLongSword().addActionListener(new addItemListener());		
		this.champView.getMadredsRazor().addActionListener(new addItemListener());		
		this.champView.getMalady().addActionListener(new addItemListener());			
		this.champView.getManaManipulator().addActionListener(new addItemListener());		
		this.champView.getManaPotion().addActionListener(new addItemListener());		
		this.champView.getManamune().addActionListener(new addItemListener());	
		this.champView.getMawOfMalmortius().addActionListener(new addItemListener());		
		this.champView.getMejaisSoulstealer().addActionListener(new addItemListener());		
		this.champView.getMercurialScimitar().addActionListener(new addItemListener());	
		this.champView.getMercurysTreads().addActionListener(new addItemListener());		
		this.champView.getMikaelsCrucibal().addActionListener(new addItemListener());		
		this.champView.getMorellonomicon().addActionListener(new addItemListener());		
		this.champView.getMuramana().addActionListener(new addItemListener());		
		this.champView.getNashorsTooth().addActionListener(new addItemListener());		
		this.champView.getNeedlesslyLargeRod().addActionListener(new addItemListener());		
		this.champView.getNegatronCloak().addActionListener(new addItemListener());		
		this.champView.getNinjaTabi().addActionListener(new addItemListener());		
		this.champView.getNullMagicMantle().addActionListener(new addItemListener());		
		this.champView.getOhmwrecker().addActionListener(new addItemListener());		
		this.champView.getOraclesElixir().addActionListener(new addItemListener());		
		this.champView.getPhage().addActionListener(new addItemListener());	
		this.champView.getPhantomDancer().addActionListener(new addItemListener());		
		this.champView.getPhilsophersStone().addActionListener(new addItemListener());		
		this.champView.getPickaxe().addActionListener(new addItemListener());		
		this.champView.getQuicksilverSash().addActionListener(new addItemListener());		
		this.champView.getRabadonsDeathcap().addActionListener(new addItemListener());		
		this.champView.getRanduinsOmen().addActionListener(new addItemListener());		
		this.champView.getRavenousHydra().addActionListener(new addItemListener());	
		this.champView.getRecurveBow().addActionListener(new addItemListener());	
		this.champView.getRejuvenationBead().addActionListener(new addItemListener());		
		this.champView.getRodOfAges().addActionListener(new addItemListener());		
		this.champView.getRubyCrystal().addActionListener(new addItemListener());		
		this.champView.getRubySightstone().addActionListener(new addItemListener());		
		this.champView.getRunaansHurricane().addActionListener(new addItemListener());		
		this.champView.getRunicBulwark().addActionListener(new addItemListener());		
		this.champView.getRylaisCrystalScepter().addActionListener(new addItemListener());	
		this.champView.getSapphireCrystal().addActionListener(new addItemListener());		
		this.champView.getSeraphsEmbrace().addActionListener(new addItemListener());		
		this.champView.getShardOfTrueIce().addActionListener(new addItemListener());		
		this.champView.getSheen().addActionListener(new addItemListener());		
		this.champView.getShurelyasReverie().addActionListener(new addItemListener());		
		this.champView.getSightward().addActionListener(new addItemListener());		
		this.champView.getSightstone().addActionListener(new addItemListener());		
		this.champView.getSorcerersShoes().addActionListener(new addItemListener());	
		this.champView.getSpiritOfTheAncientGolem().addActionListener(new addItemListener());		
		this.champView.getSpiritOfTheElderLizard().addActionListener(new addItemListener());		
		this.champView.getSpiritOfTheSpectralWraith().addActionListener(new addItemListener());		
		this.champView.getSpiritStone().addActionListener(new addItemListener());		
		this.champView.getSpiritVisage().addActionListener(new addItemListener());		
		this.champView.getStatikkShiv().addActionListener(new addItemListener());		
		this.champView.getStinger().addActionListener(new addItemListener());	
		this.champView.getSunfireCape().addActionListener(new addItemListener());		
		this.champView.getSwordOfTheDivine().addActionListener(new addItemListener());		
		this.champView.getSwordOfTheOccult().addActionListener(new addItemListener());		
		this.champView.getTearOfTheGoddess().addActionListener(new addItemListener());		
		this.champView.getTheBlackCleaver().addActionListener(new addItemListener());		
		this.champView.getTheBloodthirster().addActionListener(new addItemListener());		
		this.champView.getTheBrutilizer().addActionListener(new addItemListener());		
		this.champView.getTheHexCore().addActionListener(new addItemListener());	
		this.champView.getThornmail().addActionListener(new addItemListener());	
		this.champView.getTiamat().addActionListener(new addItemListener());		
		this.champView.getTrinityForce().addActionListener(new addItemListener());		
		this.champView.getTwinShadows().addActionListener(new addItemListener());	
		this.champView.getVampiricScepter().addActionListener(new addItemListener());		
		this.champView.getVisionWard().addActionListener(new addItemListener());	
		this.champView.getVoidStaff().addActionListener(new addItemListener());		
		this.champView.getWardensMail().addActionListener(new addItemListener());		
		this.champView.getWarmogsArmor().addActionListener(new addItemListener());		
		this.champView.getWillOfTheAncients().addActionListener(new addItemListener());		
		this.champView.getWitsEnd().addActionListener(new addItemListener());	
		this.champView.getWrigglesLantern().addActionListener(new addItemListener());	
		this.champView.getYoumuusGhostBlade().addActionListener(new addItemListener());		
		this.champView.getZeal().addActionListener(new addItemListener());		
		this.champView.getZekesHerald().addActionListener(new addItemListener());	
		this.champView.getZephyr().addActionListener(new addItemListener());		
		this.champView.getZhonyasHourglass().addActionListener(new addItemListener());
		
	}
}

