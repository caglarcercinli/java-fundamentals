package be.vdab.domain;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.KostRepositoryStub;
import be.vdab.repositories.OpbrengstRepository;
import be.vdab.repositories.OpbrengstRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class WinstServiceTest {
    @Mock
    private OpbrengstRepository opbrengstRepository;
    @Mock
    private KostRepository kostRepository;
    private WinstService winstService;

    @BeforeEach
    void beforeEach() {
        //winstService = new WinstService(new OpbrengstRepositoryStub(), new KostRepositoryStub());
        winstService = new WinstService(opbrengstRepository,kostRepository);
    }

    @Test
    void winstIsOpbrengstMinKost() {
        when(opbrengstRepository.findTotaleOpbrengst()).thenReturn(BigDecimal.valueOf(200));
        when(kostRepository.findTotaleKost()).thenReturn(BigDecimal.valueOf(31));
        assertThat(winstService.getWinst()).isEqualByComparingTo("169");
        verify(opbrengstRepository).findTotaleOpbrengst();
        verify(kostRepository).findTotaleKost();
    }
}