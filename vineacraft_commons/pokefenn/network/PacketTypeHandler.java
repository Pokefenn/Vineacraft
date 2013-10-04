package pokefenn.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import pokefenn.lib.Reference;
import pokefenn.network.packet.PacketItemUpdate;
import pokefenn.network.packet.PacketRequestEvent;
import pokefenn.network.packet.PacketTileUpdate;
import pokefenn.network.packet.PacketTileWithItemUpdate;
import pokefenn.network.packet.PacketVineacraft;

public enum PacketTypeHandler {

	
	//KEY(PacketKeyPressed.class),
    TILE(PacketTileUpdate.class),
    REQUEST_EVENT(PacketRequestEvent.class),
    //SPAWN_PARTICLE(PacketSpawnParticle.class),
    //SOUND_EVENT(PacketSoundEvent.class),
    ITEM_UPDATE(PacketItemUpdate.class),
    TILE_WITH_ITEM(PacketTileWithItemUpdate.class);

    private Class<? extends PacketVineacraft> clazz;

    PacketTypeHandler(Class<? extends PacketVineacraft> clazz) {

        this.clazz = clazz;
    }

    public static PacketVineacraft buildPacket(byte[] data) {

        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        int selector = bis.read();
        DataInputStream dis = new DataInputStream(bis);

        PacketVineacraft packet = null;

        try {
            packet = values()[selector].clazz.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

        packet.readPopulate(dis);

        return packet;
    }

    public static PacketVineacraft buildPacket(PacketTypeHandler type) {

        PacketVineacraft packet = null;

        try {
            packet = values()[type.ordinal()].clazz.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

        return packet;
    }

    public static Packet populatePacket(PacketVineacraft packetVineacraft) {

        byte[] data = packetVineacraft.populate();

        Packet250CustomPayload packet250 = new Packet250CustomPayload();
        packet250.channel = Reference.CHANNEL_NAME;
        packet250.data = data;
        packet250.length = data.length;
        packet250.isChunkDataPacket = packetVineacraft.isChunkDataPacket;

        return packet250;
    }
	
}
