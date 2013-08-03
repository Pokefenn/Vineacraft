package pokefenn.block;

import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockVineaHarvester extends BlockVineacraft {

   public BlockVineaHarvester (int id) {
       
       super(id, Material.rock);
       this.setUnlocalizedName(Strings.VINEA_HARVESTER_NAME);
       this.setCreativeTab(Vineacraft.tabsVineac);
       this.setHardness(5F);
   }
   
    @Override
    public TileEntity createNewTileEntity(World world) {
        // TODO Auto-generated method stub
        return null;
    }

}
