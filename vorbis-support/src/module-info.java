module com.github.vorbis {
  requires java.desktop;
  requires java.logging;
  provides javax.sound.sampled.spi.AudioFileReader with com.github.trilarion.sound.vorbis.sampled.spi.VorbisAudioFileReader;
  provides javax.sound.sampled.spi.FormatConversionProvider with com.github.trilarion.sound.vorbis.sampled.spi.VorbisFormatConversionProvider;
}