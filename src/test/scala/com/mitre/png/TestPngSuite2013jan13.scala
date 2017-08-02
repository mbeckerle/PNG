package com.mitre.png
import org.junit.Test
import edu.illinois.ncsa.daffodil.tdml.DFDLTestSuite
import edu.illinois.ncsa.daffodil.util.Misc

object TestPngSuite2013jan13 {
  val tdmlFile = "com/mitre/png/PngSuite-2013jan13.tdml"
  val validateTDML = true
  val validateDFDLSchema = true
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(tdmlFile), validateTDML, validateDFDLSchema)
  runner.setCheckAllTopLevel(true)
}

class TestPngSuite2013jan13 {
  import TestPngSuite2013jan13._

  @Test def test_PngSuite() { runner.runOneTest("PngSuite") }
  @Test def test_basi0g01() { runner.runOneTest("basi0g01") }
  @Test def test_basi0g02() { runner.runOneTest("basi0g02") }
  @Test def test_basi0g04() { runner.runOneTest("basi0g04") }
  @Test def test_basi0g08() { runner.runOneTest("basi0g08") }
  @Test def test_basi0g16() { runner.runOneTest("basi0g16") }
  @Test def test_basi2c08() { runner.runOneTest("basi2c08") }
  @Test def test_basi2c16() { runner.runOneTest("basi2c16") }
  @Test def test_basi3p01() { runner.runOneTest("basi3p01") }
  @Test def test_basi3p02() { runner.runOneTest("basi3p02") }
  @Test def test_basi3p04() { runner.runOneTest("basi3p04") }
  @Test def test_basi3p08() { runner.runOneTest("basi3p08") }
  @Test def test_basi4a08() { runner.runOneTest("basi4a08") }
  @Test def test_basi4a16() { runner.runOneTest("basi4a16") }
  @Test def test_basi6a08() { runner.runOneTest("basi6a08") }
  @Test def test_basi6a16() { runner.runOneTest("basi6a16") }
  @Test def test_basn0g01() { runner.runOneTest("basn0g01") }
  @Test def test_basn0g02() { runner.runOneTest("basn0g02") }
  @Test def test_basn0g04() { runner.runOneTest("basn0g04") }
  @Test def test_basn0g08() { runner.runOneTest("basn0g08") }
  @Test def test_basn0g16() { runner.runOneTest("basn0g16") }
  @Test def test_basn2c08() { runner.runOneTest("basn2c08") }
  @Test def test_basn2c16() { runner.runOneTest("basn2c16") }
  @Test def test_basn3p01() { runner.runOneTest("basn3p01") }
  @Test def test_basn3p02() { runner.runOneTest("basn3p02") }
  @Test def test_basn3p04() { runner.runOneTest("basn3p04") }
  @Test def test_basn3p08() { runner.runOneTest("basn3p08") }
  @Test def test_basn4a08() { runner.runOneTest("basn4a08") }
  @Test def test_basn4a16() { runner.runOneTest("basn4a16") }
  @Test def test_basn6a08() { runner.runOneTest("basn6a08") }
  @Test def test_basn6a16() { runner.runOneTest("basn6a16") }
  @Test def test_bgai4a08() { runner.runOneTest("bgai4a08") }
  @Test def test_bgai4a16() { runner.runOneTest("bgai4a16") }
  @Test def test_bgan6a08() { runner.runOneTest("bgan6a08") }
  @Test def test_bgan6a16() { runner.runOneTest("bgan6a16") }
  @Test def test_bgbn4a08() { runner.runOneTest("bgbn4a08") }
  @Test def test_bggn4a16() { runner.runOneTest("bggn4a16") }
  @Test def test_bgwn6a08() { runner.runOneTest("bgwn6a08") }
  @Test def test_bgyn6a16() { runner.runOneTest("bgyn6a16") }
  @Test def test_ccwn2c08() { runner.runOneTest("ccwn2c08") }
  @Test def test_ccwn3p08() { runner.runOneTest("ccwn3p08") }
  @Test def test_cdfn2c08() { runner.runOneTest("cdfn2c08") }
  @Test def test_cdhn2c08() { runner.runOneTest("cdhn2c08") }
  @Test def test_cdsn2c08() { runner.runOneTest("cdsn2c08") }
  @Test def test_cdun2c08() { runner.runOneTest("cdun2c08") }
  @Test def test_ch1n3p04() { runner.runOneTest("ch1n3p04") }
  @Test def test_ch2n3p08() { runner.runOneTest("ch2n3p08") }
  @Test def test_cm0n0g04() { runner.runOneTest("cm0n0g04") }
  @Test def test_cm7n0g04() { runner.runOneTest("cm7n0g04") }
  @Test def test_cm9n0g04() { runner.runOneTest("cm9n0g04") }
  @Test def test_cs3n2c16() { runner.runOneTest("cs3n2c16") }
  @Test def test_cs3n3p08() { runner.runOneTest("cs3n3p08") }
  @Test def test_cs5n2c08() { runner.runOneTest("cs5n2c08") }
  @Test def test_cs5n3p08() { runner.runOneTest("cs5n3p08") }
  @Test def test_cs8n2c08() { runner.runOneTest("cs8n2c08") }
  @Test def test_cs8n3p08() { runner.runOneTest("cs8n3p08") }
  @Test def test_ct0n0g04() { runner.runOneTest("ct0n0g04") }
  @Test def test_ct1n0g04() { runner.runOneTest("ct1n0g04") }
  @Test def test_cten0g04() { runner.runOneTest("cten0g04") }
  @Test def test_ctfn0g04() { runner.runOneTest("ctfn0g04") }
  @Test def test_ctgn0g04() { runner.runOneTest("ctgn0g04") }
  @Test def test_cthn0g04() { runner.runOneTest("cthn0g04") }
  @Test def test_ctjn0g04() { runner.runOneTest("ctjn0g04") }
  @Test def test_ctzn0g04() { runner.runOneTest("ctzn0g04") }
  @Test def test_f00n0g08() { runner.runOneTest("f00n0g08") }
  @Test def test_f00n2c08() { runner.runOneTest("f00n2c08") }
  @Test def test_f01n0g08() { runner.runOneTest("f01n0g08") }
  @Test def test_f01n2c08() { runner.runOneTest("f01n2c08") }
  @Test def test_f02n0g08() { runner.runOneTest("f02n0g08") }
  @Test def test_f02n2c08() { runner.runOneTest("f02n2c08") }
  @Test def test_f03n0g08() { runner.runOneTest("f03n0g08") }
  @Test def test_f03n2c08() { runner.runOneTest("f03n2c08") }
  @Test def test_f04n0g08() { runner.runOneTest("f04n0g08") }
  @Test def test_f04n2c08() { runner.runOneTest("f04n2c08") }
  @Test def test_f99n0g04() { runner.runOneTest("f99n0g04") }
  @Test def test_g03n0g16() { runner.runOneTest("g03n0g16") }
  @Test def test_g03n2c08() { runner.runOneTest("g03n2c08") }
  @Test def test_g03n3p04() { runner.runOneTest("g03n3p04") }
  @Test def test_g04n0g16() { runner.runOneTest("g04n0g16") }
  @Test def test_g04n2c08() { runner.runOneTest("g04n2c08") }
  @Test def test_g04n3p04() { runner.runOneTest("g04n3p04") }
  @Test def test_g05n0g16() { runner.runOneTest("g05n0g16") }
  @Test def test_g05n2c08() { runner.runOneTest("g05n2c08") }
  @Test def test_g05n3p04() { runner.runOneTest("g05n3p04") }
  @Test def test_g07n0g16() { runner.runOneTest("g07n0g16") }
  @Test def test_g07n2c08() { runner.runOneTest("g07n2c08") }
  @Test def test_g07n3p04() { runner.runOneTest("g07n3p04") }
  @Test def test_g10n0g16() { runner.runOneTest("g10n0g16") }
  @Test def test_g10n2c08() { runner.runOneTest("g10n2c08") }
  @Test def test_g10n3p04() { runner.runOneTest("g10n3p04") }
  @Test def test_g25n0g16() { runner.runOneTest("g25n0g16") }
  @Test def test_g25n2c08() { runner.runOneTest("g25n2c08") }
  @Test def test_g25n3p04() { runner.runOneTest("g25n3p04") }
  @Test def test_oi1n0g16() { runner.runOneTest("oi1n0g16") }
  @Test def test_oi1n2c16() { runner.runOneTest("oi1n2c16") }
  @Test def test_oi2n0g16() { runner.runOneTest("oi2n0g16") }
  @Test def test_oi2n2c16() { runner.runOneTest("oi2n2c16") }
  @Test def test_oi4n0g16() { runner.runOneTest("oi4n0g16") }
  @Test def test_oi4n2c16() { runner.runOneTest("oi4n2c16") }
  @Test def test_oi9n0g16() { runner.runOneTest("oi9n0g16") }
  @Test def test_oi9n2c16() { runner.runOneTest("oi9n2c16") }
  @Test def test_pp0n2c16() { runner.runOneTest("pp0n2c16") }
  @Test def test_pp0n6a08() { runner.runOneTest("pp0n6a08") }
  @Test def test_ps1n0g08() { runner.runOneTest("ps1n0g08") }
  @Test def test_ps1n2c16() { runner.runOneTest("ps1n2c16") }
  @Test def test_ps2n0g08() { runner.runOneTest("ps2n0g08") }
  @Test def test_ps2n2c16() { runner.runOneTest("ps2n2c16") }
  @Test def test_s01i3p01() { runner.runOneTest("s01i3p01") }
  @Test def test_s01n3p01() { runner.runOneTest("s01n3p01") }
  @Test def test_s02i3p01() { runner.runOneTest("s02i3p01") }
  @Test def test_s02n3p01() { runner.runOneTest("s02n3p01") }
  @Test def test_s03i3p01() { runner.runOneTest("s03i3p01") }
  @Test def test_s03n3p01() { runner.runOneTest("s03n3p01") }
  @Test def test_s04i3p01() { runner.runOneTest("s04i3p01") }
  @Test def test_s04n3p01() { runner.runOneTest("s04n3p01") }
  @Test def test_s05i3p02() { runner.runOneTest("s05i3p02") }
  @Test def test_s05n3p02() { runner.runOneTest("s05n3p02") }
  @Test def test_s06i3p02() { runner.runOneTest("s06i3p02") }
  @Test def test_s06n3p02() { runner.runOneTest("s06n3p02") }
  @Test def test_s07i3p02() { runner.runOneTest("s07i3p02") }
  @Test def test_s07n3p02() { runner.runOneTest("s07n3p02") }
  @Test def test_s08i3p02() { runner.runOneTest("s08i3p02") }
  @Test def test_s08n3p02() { runner.runOneTest("s08n3p02") }
  @Test def test_s09i3p02() { runner.runOneTest("s09i3p02") }
  @Test def test_s09n3p02() { runner.runOneTest("s09n3p02") }
  @Test def test_s32i3p04() { runner.runOneTest("s32i3p04") }
  @Test def test_s32n3p04() { runner.runOneTest("s32n3p04") }
  @Test def test_s33i3p04() { runner.runOneTest("s33i3p04") }
  @Test def test_s33n3p04() { runner.runOneTest("s33n3p04") }
  @Test def test_s34i3p04() { runner.runOneTest("s34i3p04") }
  @Test def test_s34n3p04() { runner.runOneTest("s34n3p04") }
  @Test def test_s35i3p04() { runner.runOneTest("s35i3p04") }
  @Test def test_s35n3p04() { runner.runOneTest("s35n3p04") }
  @Test def test_s36i3p04() { runner.runOneTest("s36i3p04") }
  @Test def test_s36n3p04() { runner.runOneTest("s36n3p04") }
  @Test def test_s37i3p04() { runner.runOneTest("s37i3p04") }
  @Test def test_s37n3p04() { runner.runOneTest("s37n3p04") }
  @Test def test_s38i3p04() { runner.runOneTest("s38i3p04") }
  @Test def test_s38n3p04() { runner.runOneTest("s38n3p04") }
  @Test def test_s39i3p04() { runner.runOneTest("s39i3p04") }
  @Test def test_s39n3p04() { runner.runOneTest("s39n3p04") }
  @Test def test_s40i3p04() { runner.runOneTest("s40i3p04") }
  @Test def test_s40n3p04() { runner.runOneTest("s40n3p04") }
  @Test def test_tbbn0g04() { runner.runOneTest("tbbn0g04") }
  @Test def test_tbbn2c16() { runner.runOneTest("tbbn2c16") }
  @Test def test_tbbn3p08() { runner.runOneTest("tbbn3p08") }
  @Test def test_tbgn2c16() { runner.runOneTest("tbgn2c16") }
  @Test def test_tbgn3p08() { runner.runOneTest("tbgn3p08") }
  @Test def test_tbrn2c08() { runner.runOneTest("tbrn2c08") }
  @Test def test_tbwn0g16() { runner.runOneTest("tbwn0g16") }
  @Test def test_tbwn3p08() { runner.runOneTest("tbwn3p08") }
  @Test def test_tbyn3p08() { runner.runOneTest("tbyn3p08") }
  @Test def test_tm3n3p02() { runner.runOneTest("tm3n3p02") }
  @Test def test_tp0n0g08() { runner.runOneTest("tp0n0g08") }
  @Test def test_tp0n2c08() { runner.runOneTest("tp0n2c08") }
  @Test def test_tp0n3p08() { runner.runOneTest("tp0n3p08") }
  @Test def test_tp1n3p08() { runner.runOneTest("tp1n3p08") }
  @Test def test_xc1n0g08() { runner.runOneTest("xc1n0g08") }
  @Test def test_xc9n2c08() { runner.runOneTest("xc9n2c08") }
  @Test def test_xcrn0g04() { runner.runOneTest("xcrn0g04") }
  @Test def test_xcsn0g01() { runner.runOneTest("xcsn0g01") }
  @Test def test_xd0n2c08() { runner.runOneTest("xd0n2c08") }
  @Test def test_xd3n2c08() { runner.runOneTest("xd3n2c08") }
  @Test def test_xd9n2c08() { runner.runOneTest("xd9n2c08") }
  @Test def test_xdtn0g01() { runner.runOneTest("xdtn0g01") }
  @Test def test_xhdn0g08() { runner.runOneTest("xhdn0g08") }
  @Test def test_xlfn0g04() { runner.runOneTest("xlfn0g04") }
  @Test def test_xs1n0g01() { runner.runOneTest("xs1n0g01") }
  @Test def test_xs2n0g01() { runner.runOneTest("xs2n0g01") }
  @Test def test_xs4n0g01() { runner.runOneTest("xs4n0g01") }
  @Test def test_xs7n0g01() { runner.runOneTest("xs7n0g01") }
  @Test def test_z00n2c08() { runner.runOneTest("z00n2c08") }
  @Test def test_z03n2c08() { runner.runOneTest("z03n2c08") }
  @Test def test_z06n2c08() { runner.runOneTest("z06n2c08") }
  @Test def test_z09n2c08() { runner.runOneTest("z09n2c08") }
}
