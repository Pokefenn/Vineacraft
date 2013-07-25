package pokefenn.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;

import pokefenn.lib.Strings;


@SuppressWarnings("unused")
public class TileVineac extends TileEntity {
    
    protected ForgeDirection orientation;
    protected byte state;
    protected String customName;
    
    
    /*public TileVineac {
        
        orientation = ForgeDirection.SOUTH;
        state = 0;
        customName = "";
        
        
    }
    */
    
    public ForgeDirection getOrientation() {
        
        return orientation;
    }

    
    public void setOrientation(int orientation) {
        
        
    }

    public short getState() {

        return state;
    }

    public void setState(byte state) {

        this.state = state;
    }

    public boolean hasCustomName() {

        return customName != null && customName.length() > 0;
    }

    public String getCustomName() {

        return customName;
    }

    public void setCustomName(String customName) {

        this.customName = customName;
    }

    public boolean isUseableByPlayer(EntityPlayer player) {

        return true;

}
    
}
