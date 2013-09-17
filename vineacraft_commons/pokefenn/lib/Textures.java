package pokefenn.lib;

import net.minecraft.util.ResourceLocation;
import pokefenn.util.ResourceLocationHelper;

public class Textures {

	//FilePaths
	
	public static final String MODEL_SHEET_LOCATION = "textures/models/";
    public static final String ARMOR_SHEET_LOCATION = "textures/armor/";
    public static final String GUI_SHEET_LOCATION = "textures/gui/";
    public static final String EFFECTS_LOCATION = "textures/effects/";
	
	//Blocks
	
	
	//Items
	
    public static final String VINEAPEDIA_ICON = "vineapedia";
	
	//Gui
	
    public static final ResourceLocation GUI_AUTOMATIC_SQUEEZER = ResourceLocationHelper.getResourceLocation(GUI_SHEET_LOCATION + "automaticSqueezer.png");
    public static final ResourceLocation GUI_VINEA_FURNACE = ResourceLocationHelper.getResourceLocation(GUI_SHEET_LOCATION + "vineaFurnace.png");
    public static final ResourceLocation GUI_VINEA_INFUSER = ResourceLocationHelper.getResourceLocation(GUI_SHEET_LOCATION + "vineaInfuser.png");
	
	//Model
	
	//Fluids
    public static final String TEXTURE_LOCATION = "vineacraft";
    
    public static final String VINE_SAP_STILL = "vineSapStill";
    public static final String VINE_SAP_FLOWING = "vineSapFlowing";
	
}
