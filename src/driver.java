import Controllers.LDCController;
import Model.LDCModel;
import Views.LDCChampionView;
import Views.LDCView;

public class driver {

	static LDCModel theLDCModel = new LDCModel();
	static LDCView theLDCView = new LDCView();
	static LDCChampionView theLDCChampionView = new LDCChampionView();
	static LDCController theLDCController = new LDCController();	

	
	public static void main (String[] args){	
		
		theLDCController.setModel(theLDCModel);
		theLDCChampionView.setModel(theLDCModel);
		theLDCController.setChampView(theLDCChampionView);
		theLDCController.setView(theLDCView);		
		
	}
}

