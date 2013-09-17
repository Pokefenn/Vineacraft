
package pokefenn.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fluids.FluidStack;

import org.lwjgl.opengl.GL11;

import pokefenn.inventory.ContainerVineaFurnace;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import pokefenn.tileentity.TileVineaFurnace;

public class GuiVineaFurnace extends GuiContainer {

	
	
	
	 private TileVineaFurnace tileVineaFurnace;

	    public GuiVineaFurnace(InventoryPlayer inventoryPlayer, TileVineaFurnace tileVineaFurnace){
	    	
	    	
	    super(new ContainerVineaFurnace(inventoryPlayer, tileVineaFurnace));
	    
	    xSize = 176;
        ySize = 165;
        this.tileVineaFurnace = tileVineaFurnace;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y) {

	    String containerName = tileVineaFurnace.isInvNameLocalized() ? tileVineaFurnace.getInvName() : StatCollector.translateToLocal(tileVineaFurnace.getInvName());
	    fontRenderer.drawString(containerName, xSize / 2 - fontRenderer.getStringWidth(containerName) / 2, 6, 4210752);
	    fontRenderer.drawString(StatCollector.translateToLocal(Strings.CONTAINER_INVENTORY), 8, ySize - 96 + 2, 4210752);
	        
	    }
	    
	    

	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.mc.getTextureManager().bindTexture(Textures.GUI_VINEA_FURNACE);
        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }
	
	
	
	}
	


		
		

	


