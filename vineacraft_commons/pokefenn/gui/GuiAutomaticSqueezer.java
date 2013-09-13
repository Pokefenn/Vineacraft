package pokefenn.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

import org.lwjgl.opengl.GL11;

import pokefenn.inventory.ContainerAutomaticSqueezer;
import pokefenn.lib.Textures;
import pokefenn.tileentity.TileAutomaticSqueezer;

public class GuiAutomaticSqueezer extends GuiContainer {

	
	
	
	public GuiAutomaticSqueezer(InventoryPlayer invPlayer, TileAutomaticSqueezer automaticSqueezer){
		super(new ContainerAutomaticSqueezer(invPlayer, automaticSqueezer));
		
	    xSize = 176;
        ySize = 166;
	}


	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1, 1, 1, 1);
		
		this.mc.getTextureManager().bindTexture(Textures.GUI_AUTOMATIC_SQUEEZER);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}


		
		

	

}
