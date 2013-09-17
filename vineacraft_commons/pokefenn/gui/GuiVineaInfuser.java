
package pokefenn.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import pokefenn.inventory.ContainerVineaInfuser;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import pokefenn.tileentity.TileVineaInfuser;

public class GuiVineaInfuser extends GuiContainer {

	
	
	
	 private TileVineaInfuser tileVineaInfuser;

	    public GuiVineaInfuser(InventoryPlayer inventoryPlayer, TileVineaInfuser tileVineaInfuser){
	    	
	    	
	    super(new ContainerVineaInfuser(inventoryPlayer, tileVineaInfuser));
	    
	    xSize = 176;
        ySize = 165;
        this.tileVineaInfuser = tileVineaInfuser;
	}

	    @Override
	    protected void drawGuiContainerForegroundLayer(int x, int y) {

	        String containerName = tileVineaInfuser.isInvNameLocalized() ? tileVineaInfuser.getInvName() : StatCollector.translateToLocal(tileVineaInfuser.getInvName());
	        fontRenderer.drawString(containerName, xSize / 2 - fontRenderer.getStringWidth(containerName) / 2, 6, 4210752);
	        fontRenderer.drawString(StatCollector.translateToLocal(Strings.CONTAINER_INVENTORY), 8, ySize - 96 + 2, 4210752);
	        
	    }
	    
	    

	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.mc.getTextureManager().bindTexture(Textures.GUI_VINEA_INFUSER);
        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }
	}


		
		

	


