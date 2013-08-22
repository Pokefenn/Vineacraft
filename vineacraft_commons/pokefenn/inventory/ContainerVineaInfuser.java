package pokefenn.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import pokefenn.lib.Strings;
import pokefenn.tileentity.TileVineacraft;


public class ContainerVineaInfuser extends Container {

    @Override
    public boolean canInteractWith(EntityPlayer entityplayer) {
        return true;
    }

}
