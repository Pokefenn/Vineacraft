package pokefenn.proxy;

import net.minecraft.tileentity.TileEntity;
import pokefenn.lib.Strings;
import pokefenn.tileentity.TileAutomaticSqueezer;
import pokefenn.tileentity.TileVineacraft;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {

    
    
    public void registerRenderers() {
    
    
    }


 


	public void initRenderingAndTextures() {
		
	}
	
	
public static void registerTileEntities() {
        
    	//Register tile entites into the game.
    	
        //GameRegistry.registerTileEntity(TileManualSqueezer.class, Strings.TE_MANUAL_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileAutomaticSqueezer.class, Strings.TE_AUTOMATIC_SQUEEZER_NAME);
        //GameRegistry.registerTileEntity(TileAdvancedSqueezer.class, Strings.TE_ADVANCED_SQUEEZER_NAME);
        //GameRegistry.registerTileEntity(TileVineaHatcher.class, Strings.TE_VINEA_HATCHER_NAME);
        //GameRegistry.registerTileEntity(TileVineaFurnace.class, Strings.TE_VINEA_FURNACE_NAME);
        //GameRegistry.registerTileEntity(TileVineaInfuser.class, Strings.TE_VINEA_INFUSER_NAME);
        //GameRegistry.registerTileEntity(TileVineaHarvester.class, Strings.TE_VINEA_HARVESTER_NAME);
        //GameRegistry.registerTileEntity(TileVineaHopper.class, Strings.TE_VINEA_HOPPER_NAME);
        
        
    }
	
	
    }

    
    
    



