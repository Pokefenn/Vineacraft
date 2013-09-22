package pokefenn.block;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import pokefenn.Vineacraft;
import pokefenn.lib.strings;

public class BlockVineRoot extends BlockVineacraft {



       public BlockVineRoot.java(int id){
       
               super(id, Material.wood);
       this.setUnlocalizedName(Strings.VINEA_HOPPER_NAME);
       this.setCreativeTab(Vineacraft.tabesVineac);
       
       }
       
       @Override
       public TileEntity createNewTileEntity(World world) {
       
               return null;
       }
}
