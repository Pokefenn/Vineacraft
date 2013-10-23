package pokefenn.proxy;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import pokefenn.network.PacketTypeHandler;
import pokefenn.network.packet.PacketRequestEvent;
import pokefenn.tileentity.TileVineacraft;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.PacketDispatcher;

public class ClientProxy extends CommonProxy {
        
        
	 @Override
	    public void initRenderingAndTextures() {
            
        	
        }
 
	 
	 @Override
	    public void sendRequestEventPacket(byte eventType, int originX, int originY, int originZ, byte sideHit, byte rangeX, byte rangeY, byte rangeZ, String data) {

	        PacketDispatcher.sendPacketToServer(PacketTypeHandler.populatePacket(new PacketRequestEvent(eventType, originX, originY, originZ, sideHit, rangeX, rangeY, rangeZ, data)));
	    }

	    @Override
	    public void handleTileEntityPacket(int x, int y, int z, ForgeDirection orientation, byte state, String customName) {

	        TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getBlockTileEntity(x, y, z);

	        if (tileEntity != null) {
	            if (tileEntity instanceof TileVineacraft) {
	                ((TileVineacraft) tileEntity).setOrientation(orientation);
	                ((TileVineacraft) tileEntity).setState(state);
	                ((TileVineacraft) tileEntity).setCustomName(customName);
	            }
	        }
	    }
	 
	 
}