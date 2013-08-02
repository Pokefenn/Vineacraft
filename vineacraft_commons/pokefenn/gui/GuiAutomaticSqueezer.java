/*package pokefenn.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

import org.lwjgl.opengl.GL11;

import pokefenn.inventory.ContainerAutomaticSqueezer;
import pokefenn.tileentity.TileAutomaticSqueezer;

public class GuiAutomaticSqueezer {

  //@SideOnly(Side.CLIENT)
    public class ContainerAdvancedSqueezer extends GuiContainer {

        public GuiAdvancedSqueezer(InventoryPlayer invPlayer, TileAutomaticSqueezer automaticSqueezer) {
            super(new ContainerAutomaticSqueezer(invPlayer, automaticSqueezer));
           
            xSize = 176;
            ySize = 166;
        }

        private static final ResourceLocation texture = new ResourceLocation("temp", "notActually.png");
        
        
        @Override
        protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
            GL11.glColor4f(1, 1, 1, 1);
            
            Minecraft.getMinecraft().func_110434_K().func_110577_a(texture);
            drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize) ;
            
        }

}
*/