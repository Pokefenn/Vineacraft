package pokefenn;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import pokefenn.addons.tinkersconstruct.VineaTinkerAddon;
import pokefenn.block.ModBlocks;
import pokefenn.configuration.ConfigurationHandler;
import pokefenn.creativetab.CreativeTabVineac;
import pokefenn.fluid.ModFluids;
import pokefenn.gui.GuiHandler;
import pokefenn.handlers.AddonHandler;
import pokefenn.handlers.LocalizationHandler;
import pokefenn.item.ModItems;
import pokefenn.lib.Reference;
import pokefenn.network.PacketHandler;
import pokefenn.proxy.CommonProxy;
import pokefenn.recipe.VineacraftRecipes;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;



@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false, packetHandler = PacketHandler.class)
public class Vineacraft {

    @Instance(Reference.MOD_ID)
    public static Vineacraft instance;
    
    @SidedProxy(clientSide = "pokefenn.proxy.ClientProxy", serverSide = "pokefenn.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs tabsVineac = new CreativeTabVineac(
            CreativeTabs.getNextID(), Reference.MOD_NAME);

    /*@EventHandler
    public void serverStarting(FMLServerStartingEvent event) {

        // Initialize the custom commands
        CommandHandler.initCommands(event);
    */
        
    

    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	
    	
     // Load localisation stuff bro
    	
    	LocalizationHandler.loadLanguages();
    	
    	
    	
     // Initialize the configuration
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory()
                .getAbsolutePath()
                + File.separator
                + Reference.CHANNEL_NAME
                + File.separator + Reference.MOD_NAME + ".cfg"));

        
        // Initialise the Render Tick Handler (Client only)
        proxy.registerRenderers();
        
        
      //Init Fluids
    	ModFluids.init();
    	
    	
    	// Initialise mod blocks
        ModBlocks.init();


     // Initialise mod items
        ModItems.init();
        
        VineacraftRecipes.init();
        
        //ModBlocks.registerTileEntities();


        
        
        System.out.println("Ooooh, what does this button do?");
        System.out.println("Please Dee-Dee don't click the button!");        
        System.out.println("BOOM!!!");
        
        
        System.out.println("Vineacraft does not support Sopa and Pipa and i suggest that you don't.");
        
        
		}
    
    @EventHandler
    public void init(FMLInitializationEvent event){
        
    	
        //GuiHandlerStuff
        new GuiHandler();
        

    }
    
    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent event) {
    
    
     // Initialize the Addon Handler
        AddonHandler.init();
                
        
        if (Loader.isModLoaded("TConstruct")){
            
        VineaTinkerAddon.init();
    }
        

}
}