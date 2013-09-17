package pokefenn.proxy;

import pokefenn.lib.Strings;
import pokefenn.tileentity.TileAutomaticSqueezer;
import pokefenn.tileentity.TileVineaFurnace;
import pokefenn.tileentity.TileVineaInfuser;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

    
    
    public void registerRenderers() {
    
    
    }


 


	public void initRenderingAndTextures() {
		
	}
	
	
public static void registerTileEntities() {
        
    	//Register tile entites into the game.
    	
        //GameRegistry.registerTileEntity(TileManualSqueezer.class, Strings.TE_MANUAL_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileAutomaticSqueezer.class, Strings.TILE_AUTOMATIC_SQUEEZER_NAME);
        //GameRegistry.registerTileEntity(TileAdvancedSqueezer.class, Strings.TE_ADVANCED_SQUEEZER_NAME);
        //GameRegistry.registerTileEntity(TileVineaHatcher.class, Strings.TE_VINEA_HATCHER_NAME);
        GameRegistry.registerTileEntity(TileVineaFurnace.class, Strings.TILE_VINEA_FURNACE_NAME);
        GameRegistry.registerTileEntity(TileVineaInfuser.class, Strings.TILE_VINEA_INFUSER_NAME);
        //GameRegistry.registerTileEntity(TileVineaHarvester.class, Strings.TE_VINEA_HARVESTER_NAME);
        //GameRegistry.registerTileEntity(TileVineaHopper.class, Strings.TE_VINEA_HOPPER_NAME);
        
        
    }
	
	
    }

    
    
    



