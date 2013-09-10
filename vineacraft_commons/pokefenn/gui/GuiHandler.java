package pokefenn.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import pokefenn.Vineacraft;
import pokefenn.inventory.ContainerAutomaticSqueezer;
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
		
		switch (ID){
		case 0:
			TileEntity te = world.getBlockTileEntity(x, y, x);
		    if (te != null && te instanceof TileAutomaticSqueezer){
		    	return new ContainerAutomaticSqueezer(player.inventory, (TileAutomaticSqueezer)te);
					
					
		}
				break;
		
		
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
			
		switch (ID) {
			
		case 0:
		
		TileEntity te = world.getBlockTileEntity(x, y, z);
		if (te != null && te instanceof TileAutomaticSqueezer) {
			return new GuiAutomaticSqueezer(player.inventory, (TileAutomaticSqueezer)te);
			
		}
			break;
			
		}
		return null;
	}
	
	
}