
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
        //this.
        
       /* 
        private void displayGauge(int j, int k, int line, int col, int squaled, FluidStack liquid) {
            if (liquid == null) {
                    return;
            }
            int start = 0;

            Icon liquidIcon = null;
            Fluid fluid = liquid.getFluid();
            if (fluid != null && fluid.getStillIcon() != null) {
                    liquidIcon = fluid.getStillIcon();
            }
            

            if (liquidIcon != null) {
                    while (true) {
                            int x;

                            if (squaled > 16) {
                                    x = 16;
                                    squaled -= 16;
                            } else {
                                    x = squaled;
                                    squaled = 0;
                            }

                            drawTexturedModelRectFromIcon(j + col, k + line + 58 - x - start, liquidIcon, 16, 16 - (16 - x));
                            start = start + 16;

                            if (x == 0 || squaled == 0) {
                                    break;
                           }
                    }
            }
            */
    }
    
	}
	


		
		

	


