package pokefenn.proxy;

import net.minecraftforge.common.ForgeDirection;
import pokefenn.lib.Strings;
import pokefenn.tileentity.TileAutomaticSqueezer;
import pokefenn.tileentity.TileVineaFurnace;
import pokefenn.tileentity.TileVineaHarvester;
import pokefenn.tileentity.TileVineaInfuser;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

    
    
    public void registerRenderers() {
    
    
    }


    public void sendRequestEventPacket(byte eventType, int originX, int originY, int originZ, byte sideHit, byte rangeX, byte rangeY, byte rangeZ, String data) {

    }
 


	public void initRenderingAndTextures() {
		
	}
	
	public void handleTileEntityPacket(int x, int y, int z, ForgeDirection orientation, byte state, String customName) {

	}

	public void handleTileWithItemPacket(int x, int y, int z, ForgeDirection orientation, byte state, String customName, int itemID, int metaData, int stackSize, int color) {

    }

	
	
public static void registerTileEntities() {
        
    	//Register tile entites into the game.
    	
        //GameRegistry.registerTileEntity(TileManualSqueezer.class, Strings.TE_MANUAL_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileAutomaticSqueezer.class, Strings.TILE_AUTOMATIC_SQUEEZER_NAME);
        //GameRegistry.registerTileEntity(TileAdvancedSqueezer.class, Strings.TE_ADVANCED_SQUEEZER_NAME);
        //GameRegistry.registerTileEntity(TileVineaHatcher.class, Strings.TE_VINEA_HATCHER_NAME);
        GameRegistry.registerTileEntity(TileVineaFurnace.class, Strings.TILE_VINEA_FURNACE_NAME);
        GameRegistry.registerTileEntity(TileVineaInfuser.class, Strings.TILE_VINEA_INFUSER_NAME);
        GameRegistry.registerTileEntity(TileVineaHarvester.class, Strings.TILE_VINEA_HARVESTER_NAME);
        //GameRegistry.registerTileEntity(TileVineaHopper.class, Strings.TE_VINEA_HOPPER_NAME);
        
        
    }


public void registerRenderTickHandler() {
	// TODO Auto-generated method stub
	
}
	
	
    }

    
    
    



