package pokefenn.inventory;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerAdvancedSqueezer extends Container {

    
    
    @Override
    public boolean canInteractWith(EntityPlayer entityplayer) {
        return false;
    }
    
    
    
}



