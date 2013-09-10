package pokefenn.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import pokefenn.inventory.ContainerAutomaticSqueezer;
import pokefenn.tileentity.TileAutomaticSqueezer;

public class GuiAutomaticSqueezer extends GuiContainer {

	
	
	
	public GuiAutomaticSqueezer(InventoryPlayer invPlayer, TileAutomaticSqueezer automaticSqueezer){
		super(new ContainerAutomaticSqueezer(invPlayer, automaticSqueezer));
		
	    xSize = 176;
        ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("Vineacraft", "resources/assets/vineacraft/textures/gui/automaticSqueezerGUI.png");
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1, 1, 1, 1);
		
		this.mc.getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}


		
		

	

}
