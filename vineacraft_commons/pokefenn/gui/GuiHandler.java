package pokefenn.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import pokefenn.Vineacraft;
import pokefenn.inventory.ContainerAutomaticSqueezer;
import pokefenn.inventory.ContainerVineaFurnace;
import pokefenn.inventory.ContainerVineaInfuser;
import pokefenn.lib.GuiIds;
import pokefenn.tileentity.TileAutomaticSqueezer;
import pokefenn.tileentity.TileVineaFurnace;
import pokefenn.tileentity.TileVineaInfuser;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {

	public GuiHandler() {
		NetworkRegistry.instance().registerGuiHandler(Vineacraft.instance, this);
		
	}
	
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == GuiIds.AUTOMATIC_SQUEEZER){
			
			TileAutomaticSqueezer tileAutomaticSqueezer = (TileAutomaticSqueezer) world.getBlockTileEntity(x, y, z);
            return new ContainerAutomaticSqueezer(player.inventory, tileAutomaticSqueezer);
			
		}
		
		else if (ID == GuiIds.VINEA_FURNACE){
			
		    TileVineaFurnace tileVineaFurnace = (TileVineaFurnace) world.getBlockTileEntity(x, y, z);
            return new ContainerVineaFurnace(player.inventory, tileVineaFurnace);
			
			
		}
		
         else if (ID == GuiIds.VINEA_INFUSER){
			
			TileVineaInfuser tileVineaInfuser = (TileVineaInfuser) world.getBlockTileEntity(x, y, z);
			return new ContainerVineaInfuser(player.inventory, tileVineaInfuser);
			
			
		}
		
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
			
		if (ID == GuiIds.AUTOMATIC_SQUEEZER) {
            TileAutomaticSqueezer tileAutomaticSqueezer = (TileAutomaticSqueezer) world.getBlockTileEntity(x, y, z);
            return new GuiAutomaticSqueezer(player.inventory, tileAutomaticSqueezer);
        }
		
		else if (ID == GuiIds.VINEA_FURNACE){
			
			
			TileVineaFurnace tileVineaFurnace = (TileVineaFurnace) world.getBlockTileEntity(x, y, z);
            return new GuiVineaFurnace(player.inventory, tileVineaFurnace);
        
			
		}
        else if (ID == GuiIds.VINEA_INFUSER){
			
			
			TileVineaInfuser tileVineaInfuser = (TileVineaInfuser) world.getBlockTileEntity(x, y, z);
            return new GuiVineaInfuser(player.inventory, tileVineaInfuser);
        
			
		}
	/*	
        else if (ID == GuiIds.VINEAPEDIA){
        	
        	return new GuiVineaPedia(ItemStack);
        	
        }
        */
		
		return null;
	}
	
	
}