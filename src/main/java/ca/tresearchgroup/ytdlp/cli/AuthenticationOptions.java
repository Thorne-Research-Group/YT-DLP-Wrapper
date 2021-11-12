package ca.tresearchgroup.ytdlp.cli;

import lombok.*;
import picocli.CommandLine;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AuthenticationOptions {
    @CommandLine.Option(names = "--username")
    private String username;
    @CommandLine.Option(names = "--password")
    private String password;
    @CommandLine.Option(names = "--twofactor")
    private String twoFactor;
    @CommandLine.Option(names = "--netrc")
    private boolean netrc;
    @CommandLine.Option(names = "--netrc-location")
    private String netRcLocation;
    @CommandLine.Option(names = "--video-password")
    private String videoPassword;
    @CommandLine.Option(names = "--ap-mso")
    private String apMso;
    @CommandLine.Option(names = "--ap-username")
    private String apUsername;
    @CommandLine.Option(names = "--ap-password")
    private String apPassword;
    @CommandLine.Option(names = "--ap-list-mso")
    private String apListMso;
}
