package pokefenn.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import pokefenn.Vineacraft;
import pokefenn.inventory.ContainerAutomaticSqueezer;
import pokefenn.lib.GuiIds;
import pokefenn.tileentity.TileAutomaticSqueezer;
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
		
		
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
			
		if (ID == GuiIds.AUTOMATIC_SQUEEZER) {
            TileAutomaticSqueezer tileAutomaticSqueezer = (TileAutomaticSqueezer) world.getBlockTileEntity(x, y, z);
            return new GuiAutomaticSqueezer(player.inventory, tileAutomaticSqueezer);
        }
		
		
		
		return null;
	}
	
	
}