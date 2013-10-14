package pokefenn.network;

import pokefenn.network.packet.PacketVineacraft;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler {

	 @Override
	    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {

	        // Build a PacketEE object from the data contained within the Packet250CustomPayload packet
	        PacketVineacraft packetVineacraft = PacketTypeHandler.buildPacket(packet.data);

	        // Execute the appropriate actions based on the PacketEE type
	        packetVineacraft.execute(manager, player);
	        
	        
	        
	    }

	}

	
	
	

