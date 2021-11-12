package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GeoRestrictionOptions {
    @CommandLine.Option(names = "--geo-verification-proxy")
    private String geoVerificationProxy;
    @CommandLine.Option(names = "--geo-bypass")
    private boolean geoBypass;
    @CommandLine.Option(names = "--geo-bypass-country")
    private String geoBypassCountry;
    @CommandLine.Option(names = "--geo-bypass-ip-block")
    private String geoBypassIpBlock;
}
