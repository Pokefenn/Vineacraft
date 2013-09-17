package pokefenn.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import pokefenn.inventory.ContainerAutomaticSqueezer;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import pokefenn.tileentity.TileAutomaticSqueezer;

public class GuiAutomaticSqueezer extends GuiContainer {

	
	
	
	 private TileAutomaticSqueezer tileAutomaticSqueezer;

	    public GuiAutomaticSqueezer(InventoryPlayer inventoryPlayer, TileAutomaticSqueezer tileAutomaticSqueezer){
	    	
	    	
	    super(new ContainerAutomaticSqueezer(inventoryPlayer, tileAutomaticSqueezer));
	    
	    xSize = 176;
        ySize = 165;
        this.tileAutomaticSqueezer = tileAutomaticSqueezer;
	}

	    @Override
	    protected void drawGuiContainerForegroundLayer(int x, int y) {

	        String containerName = tileAutomaticSqueezer.isInvNameLocalized() ? tileAutomaticSqueezer.getInvName() : StatCollector.translateToLocal(tileAutomaticSqueezer.getInvName());
	        fontRenderer.drawString(containerName, xSize / 2 - fontRenderer.getStringWidth(containerName) / 2, 6, 4210752);
	        fontRenderer.drawString(StatCollector.translateToLocal(Strings.CONTAINER_INVENTORY), 8, ySize - 96 + 2, 4210752);
	        
	    }
	    
	    

	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.mc.getTextureManager().bindTexture(Textures.GUI_AUTOMATIC_SQUEEZER);
        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }
	}


		
		

	


