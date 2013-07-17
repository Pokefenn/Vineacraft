package pokefenn.proxy;

import net.minecraftforge.client.MinecraftForgeClient;
import pokefenn.proxy.CommonProxy;

public class ClientProxy extends CommonProxy {
        
        
        @SuppressWarnings("deprecation")
        @Override  
        public void registerRenderers() {
            MinecraftForgeClient.preloadTexture(ITEMS_PNG);
            MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }
        
}