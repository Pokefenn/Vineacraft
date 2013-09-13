/*package pokefenn.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import pokefenn.inventory.ContainerVineaFurnace;
import pokefenn.tileentity.TileVineaFurnace;

public class GuiVineaFurnace extends GuiContainer {

	
	
	
	public GuiVineaFurnace(InventoryPlayer invPlayer, TileVineaFurnace vineaFurnace){
		super(new ContainerVineaFurnace(invPlayer, vineaFurnace));
		
	    xSize = 176;
        ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("Vineacraft", "resources/assets/vineacraft/textures/gui/vineaFurnaceGUI.png");
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1, 1, 1, 1);
		
		this.mc.getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}


		
		

	

}
*/